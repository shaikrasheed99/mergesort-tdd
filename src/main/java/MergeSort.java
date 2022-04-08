public class MergeSort {
    public int[] sort(int[] elements) {
        int startIndex = 0;
        int endIndex = elements.length - 1;
        mergeSort(elements, startIndex, endIndex);
        return elements;
    }

    private void mergeSort(int[] elements, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            mergeSort(elements, startIndex, middleIndex);
            mergeSort(elements, middleIndex + 1, endIndex);
            merge(elements, startIndex, middleIndex, endIndex);
        }
    }

    private void merge(int[] elements, int startIndex, int middleIndex, int endIndex) {
        int start = startIndex;
        int end = middleIndex + 1;
        int[] tempArray = new int[elements.length];
        int tempIndex = 0;

        while ((start <= middleIndex) && (end <= endIndex)) {
            if (elements[start] < elements[end]) {
                tempArray[tempIndex] = elements[start];
                tempIndex += 1;
                start += 1;
            } else {
                tempArray[tempIndex] = elements[end];
                tempIndex += 1;
                end += 1;
            }
        }

        while (start <= middleIndex) {
            tempArray[tempIndex] = elements[start];
            tempIndex += 1;
            start += 1;
        }

        while (end <= endIndex) {
            tempArray[tempIndex] = elements[end];
            tempIndex += 1;
            end += 1;
        }

        tempIndex = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            elements[i] = tempArray[tempIndex];
            tempIndex += 1;
        }
    }
}
