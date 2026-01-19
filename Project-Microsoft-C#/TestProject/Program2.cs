using System;

// initialize variables - graded assignments
int currentAssignments = 5;

int[] sophieScores = new int[] { 90, 86, 87, 98, 100};
int[] andrewScrores = new int[] { 92, 89, 81, 96, 90};
int[] emmaScores = new int[] { 90, 85, 87, 98, 68};
int[] loganScores = new int[] { 90, 95, 87, 88, 96};

string[] studentNames = new string[] { "Sophia", "Andrew", "Emma", "Logan"};
int[] studentScores = new int[10];

foreach (string name in studentNames)
{
    string currentStudent = name;

    if (currentStudent == "Sophie")
    {
        studentScores = sophieScores
    }
    else if (currentStudent == "Andrew")

    int sophiaSum = 0;
    decimal sophiaScore;

    foreach ( int score in sophieScores) {
        sophiaSum += score;
    }

    sophiaScore = (decimal)sophiaSum / currentAssignments;

    Console.WriteLine("Student\t\tGrade\n");
    Console.WriteLine("Sophia:\t\t" + sophiaScore + "\tA-");
    
}

Console.WriteLine("Press the Enter key to continue");
Console.ReadLine();
