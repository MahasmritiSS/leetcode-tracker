// Last updated: 9/2/2026, 12:22:29 PM
class Solution {

    // Reverses characters between leftIndex and rightIndex.
    private void reverse(
        char[] characters,
        int leftIndex,
        int rightIndex
    ) {

        while (leftIndex < rightIndex) {

            // Swap the characters at both pointers.
            char temporaryCharacter = characters[leftIndex];
            characters[leftIndex] = characters[rightIndex];
            characters[rightIndex] = temporaryCharacter;

            leftIndex++;
            rightIndex--;
        }
    }

    public String reverseStr(String s, int k) {

        // Convert the string to a character array
        // because Java strings are immutable.
        char[] characters = s.toCharArray();

        int stringLength = characters.length;
        int blockStartIndex = 0;

        /*
         * Process the string in blocks of 2k characters.
         *
         * In every block:
         * - Reverse the first k characters.
         * - Leave the next k characters unchanged.
         */
        while (blockStartIndex < stringLength) {

            /*
             * Normally, reverse k characters.
             *
             * If fewer than k characters remain,
             * reverse all remaining characters.
             */
            int reverseEndIndex = Math.min(
                blockStartIndex + k - 1,
                stringLength - 1
            );

            reverse(
                characters,
                blockStartIndex,
                reverseEndIndex
            );

            // Move to the beginning of the next 2k block.
            blockStartIndex += 2 * k;
        }

        return new String(characters);
    }
}