import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

class SolutionTest {

    @Test
    void testFindRepeatedDnaSequences() {
        Solution solution = new Solution();

        // 测试用例 1
        String s1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> expected1 = Arrays.asList("AAAAACCCCC", "CCCCCAAAAA");
        assertEquals(expected1, solution.findRepeatedDnaSequences(s1), "Test case 1 failed");

        // 测试用例 2
        String s2 = "AAAAAAAAAAAAA";
        List<String> expected2 = Arrays.asList("AAAAAAAAAA");
        assertEquals(expected2, solution.findRepeatedDnaSequences(s2), "Test case 2 failed");

        // 测试用例 3：无重复子串
        String s3 = "ACGTACGTAC";
        List<String> expected3 = Arrays.asList();
        assertEquals(expected3, solution.findRepeatedDnaSequences(s3), "Test case 3 failed");

        // 测试用例 4：长度小于10
        String s4 = "ACGT";
        List<String> expected4 = Arrays.asList();
        assertEquals(expected4, solution.findRepeatedDnaSequences(s4), "Test case 4 failed");

        // 测试用例 5：全部重复
        String s5 = "AAAAAAAAAAAAAAAAAAAA";
        List<String> expected5 = Arrays.asList("AAAAAAAAAA");
        assertEquals(expected5, solution.findRepeatedDnaSequences(s5), "Test case 5 failed");
    }
}
