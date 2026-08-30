# RobotMonitor: Formal System Modeling & Verification
This repository contains the formal VDM-SL specification and Java implementation of the RobotMonitor system.

## Files Included
* RobotMonitor.vdmsl: The mathematical model with preconditions and invariants.
* RobotMonitor.java: The Java translation enforcing grid boundaries.
* RunRobotText.java: A text-based UI to test the system.

## How to Test the Java Code
To test this system on your local machine:
1. Ensure you have the Java Development Kit (JDK) installed.
2. Download the .java files from this repository.
3. Open your terminal or command prompt in the folder containing the files.
4. Compile the code by typing: javac *.java
5. Run the tester by typing: java RunRobotText
6. Follow the on-screen menu to move the robot using options 1 through 6.
