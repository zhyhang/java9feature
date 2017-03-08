package com.zyh.java9.feature.system;

import java.util.Arrays;

/**
 * Created by zhyhang on 17-3-8.
 */
public class SysProcessManager {

    public static void main(String... args) {
        // get current process i.e. this jvm process
        ProcessHandle currentProcess = ProcessHandle.current();
        ProcessHandle.Info info = currentProcess.info();
        System.out.format("current process OS id is %d.\n", currentProcess.getPid());
        System.out.format("\tcommand line %s\n", info.commandLine().orElse(""));
        System.out.format("\tprogram name %s\n", info.command().orElse(""));
        System.out.format("\tprogram arguments %s\n", Arrays.deepToString(info.arguments().orElse(new String[0])));
        System.out.format("\towner %s\n", info.user().orElse(""));
        // get all process
        System.out.println("current run processes:");
        ProcessHandle.allProcesses().forEach(p -> System.out.format("%s\t%d\t%s\n", p.info().user().orElse(""), p.getPid(), p.info().command().orElse("")));
    }
}
