package com.appdynamics.extensions.ballerinalang;

/**
 * Created by vanjikumaran on 9/27/17.
 */

import com.singularity.ee.agent.systemagent.api.AManagedMonitor;
import com.singularity.ee.agent.systemagent.api.MetricWriter;
import com.singularity.ee.agent.systemagent.api.TaskExecutionContext;
import com.singularity.ee.agent.systemagent.api.TaskOutput;
import com.singularity.ee.agent.systemagent.api.exception.TaskExecutionException;

import java.util.HashMap;
import java.util.Map;


public class BallerinaMonitor extends AManagedMonitor {

    public TaskOutput execute(Map<String, String> taskArgs, TaskExecutionContext out) throws TaskExecutionException {
        //Pull the necessary data based on task args
        //feed the necessary data using MetricWriter into the appD
        return new TaskOutput(" Ballerina Monitor run completed successfully.");
    }

    public static void main(String[] args) throws TaskExecutionException {

        // Execute method can be fired in two different way
        // 1) Pull mechanism - Write a schedule task and pull the information from Ballerina via jmx/ http etc....
        // 2) Push mechanism - Write the Execute implementation as a part of Data publisher of Ballerina.

        // Assign nessary parameters to do
        Map<String, String> taskArgs = new HashMap<String, String>();
        taskArgs.put(, "<conf_location>/config.yml");

        BallerinaMonitor ballerinaMonitor = new BallerinaMonitor();
        ballerinaMonitor.execute(taskArgs, null);
    }

}
