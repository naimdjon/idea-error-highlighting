import org.assertj.core.api.AbstractListAssert;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.AssertionsForInterfaceTypes;

import java.util.Collection;
import java.util.List;

public class Example {
    public static void test1(List<? extends Collection> metalist, List list1, List list2) {
        Assertions.assertThat(metalist).contains(list1, list2);
    }

    public static void test2(List<? extends Collection<?>> metalist, List list1, List list2) {
        Assertions.assertThat(metalist).contains(list1, list2);
    }

    public static void test3(List<? extends Collection<?>> metalist, List<?> list1, List<?> list2) {
        Assertions.assertThat(metalist).contains(list1, list2);
    }

    public static void test4(List<? extends Collection<?>> metalist, List<Integer> list1, List<Integer> list2) {
        Assertions.assertThat(metalist).contains(list1, list2);
    }

    public static void test5(List<? extends Collection> metalist, List<Integer> list1, List<Integer> list2) {
        Assertions.assertThat(metalist).contains(list1, list2);
    }

    public static void test6(List<? extends List> metalist, List<Integer> list1, List<Integer> list2) {
        Assertions.assertThat(metalist).contains(list1, list2);
    }


    public static <T> AbstractListAssert<?, ? extends List<? extends T>, T> assertThat(List<? extends T> actual) {
        return AssertionsForInterfaceTypes.assertThat(actual);
    }
}
