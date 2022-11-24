package com.test.assessment.company.asapp;

import java.util.ArrayList;
import java.util.List;

public class PrintHostAndPortWithRoundRobbin {

    private static Integer count = 0;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        List<String> hostAndPort = readFromFile();
        List<DomainName> domainNames = parseToDomainName(hostAndPort);
        // Map<Integer, String> map = initializeToMap(strings);
        int j = 12;
        while (j > 0) {
            DomainName domainName = returnAsRoundRobin(domainNames);
            System.out.println("Host: " + domainName.getHost() + " - " + "Port: " + domainName.getPort());
            j--;
        }
    }

    private static List<String> readFromFile() {
        List<String> strings = new ArrayList<>();
        strings.add("asapp.com:8080");
        strings.add("google.com:123");
        strings.add("microsoft.com:123");
        strings.add("github.com:123");
        strings.add("apple.com");
        strings.add(":8081");
        return strings;
    }

    private static List<DomainName> parseToDomainName(List<String> hostAndPort) {
        List<DomainName> domainNames = new ArrayList<>();
        for(String hp : hostAndPort) {
            String[] strArr = hp.split(":");
            if(strArr.length < 2) {
                domainNames.add(new DomainName(strArr[0], null));
            } else {
                domainNames.add(new DomainName(strArr[0], strArr[1]));
            }
        }
        return domainNames;
    }

    private static DomainName returnAsRoundRobin(List<DomainName> domainNameList) {
        int size = domainNameList.size();
        int index = (count%size);
        count++;
        return domainNameList.get(index);
    }

    static class DomainName {
        String host;
        String port;

        DomainName(String host, String port) {
            this.host = host;
            this.port = port;
        }

        public String getHost() {
            return this.host;
        }

        public String getPort() {
            return this.port;
        }
    }

}
