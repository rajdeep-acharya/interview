/**
 Please provide implementations to find the position of the first unique character in a String and the first unique integer in an integer array.
 If no unique found then return -1.
 example:
 "abbacd" - return 4
 12,11,12,13,11 return 3
 **/
public interface UniqueFinder<T> {
    int getFirstUnique(T input);
}
