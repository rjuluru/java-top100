```
Difficulty:1410
Expand
Prev
Next
Exit full screen
Bella ciao
Read problem statements in Vietnamese, Bengali, Mandarin Chinese, and Russian as well.

Chef is planning a heist in the reserve bank of Chefland. They are planning to hijack the bank for
D
D days and print the money. The initial rate of printing the currency is
P
P dollars per day and they increase the production by
Q
Q dollars after every interval of
d
d days. For example, after
d
d days the rate is
P
+
Q
P+Q dollars per day, and after
2
d
2d days the rate is
P
+
2
Q
P+2Q dollars per day, and so on. Output the amount of money they will be able to print in the given period.

Input
The first line contains an integer
T
T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, four integers
D
,
d
,
P
,
Q
D,d,P,Q.
Output
For each test case, output in a single line the answer to the problem.

Constraints
1
≤
T
≤
1
0
5
1≤T≤10
5

1
≤
d
≤
D
≤
1
0
6
1≤d≤D≤10
6

1
≤
P
,
Q
≤
1
0
6
1≤P,Q≤10
6

Subtasks
Subtask #1 (15 points):
d
≤
D
≤
100
d≤D≤100

Subtask #2 (85 points): original constraints

Sample 1:
Input
Output
3
2 1 1 1
3 2 1 1
5 2 1 2
3
4
13
Explanation:
Test Case
1
1:

On the first day, the rate of production is
1
1 dollar per day so
1
1 dollar is printed on the first day.
On the second day, the rate of production is
1
+
1
=
2
1+1=2 dollars per day so
2
2 dollars are printed on the second day.
The total amount of money printed in
2
2 days is
1
+
2
=
3
1+2=3 dollars.
Test Case
2
2:

For the first two days, the rate of production is
1
1 dollar per day so
1
⋅
2
=
2
1⋅2=2 dollars are printed on the first two days.
On the third day, the rate of production is
1
+
1
=
2
1+1=2 dollars per day so
2
2 dollars are printed on the third day.
The total amount of money printed in
3
3 days is
2
+
2
=
4
2+2=4 dollars.
Test Case
3
3:

For the first two days, the rate of production is
1
1 dollar per day so
1
⋅
2
=
2
1⋅2=2 dollars are printed on the first two days.
On the next two days, the rate of production is
1
+
2
=
3
1+2=3 dollars per day so
3
⋅
2
=
6
3⋅2=6 dollars are printed on the next two days.
On the last day, the rate of production is
3
+
2
=
5
3+2=5 dollars per day so
5
5 dollars are printed on the last day.
The total amount of money printed in
5
5 days is
2
+
6
+
5
=
13
2+6+5=13 dollars.
Did you like the problem statement?
53 users found this helpful
More Info
Time limit0.5 secs
Memory limit1.5 GB
Source Limit50000 Bytes
JAVA


3
2 1 1 1
3 2 1 1
5 2 1 2
Visualize Code
Run
Submit
```