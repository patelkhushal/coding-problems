# Given an array of elements, return the length of the longest subarray where all its elements are distinct.

# For example, given the array [5, 1, 3, 5, 2, 3, 4, 1], return 5 as the longest subarray of distinct elements is [5, 2, 3, 4, 1].


def compute_max_distinct_sub_array(input_nums):
    counter = 0
    max_nums = 0
    end = 0
    distinct_nums = set()
    for num in input_nums:
        if num in distinct_nums:
            curr_len = len(distinct_nums)
            if curr_len > max_nums:
                max_nums = curr_len
                end = counter
                start = end - (max_nums - 1)
                distinct_nums = set()
        distinct_nums.add(num)
        counter = counter + 1

    curr_len = len(distinct_nums)
    if curr_len > max_nums:
        max_nums = curr_len
        end = counter - 1
        start = end - (max_nums - 1)
    return [start, end]


# input_nums = [5, 1, 3, 5, 2, 3, 4, 1]
input_nums = [1,3,3,3,4,5,6,7,8]
output = compute_max_distinct_sub_array(input_nums)
print(output)
