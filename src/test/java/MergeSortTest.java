import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {
    @Test
    void shouldSortWhenElementsAreGiven() {
        int[] elements = {30, 10, 50, 20, 40};
        MergeSort mergeSort = new MergeSort();
        int[] expectedArray = {10, 20, 30, 40, 50};

        int[] actualArray = mergeSort.sort(elements);

        assertArrayEquals(expectedArray, actualArray);
    }
}
