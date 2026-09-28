package com.pairip;

/* JADX INFO: loaded from: classes.dex */
public final class StartupLauncher {
    private static boolean launchCalled = false;
    private static String startupProgramName = "DusgOJnI72iDphs5";

    public static synchronized void launch() {
        if (launchCalled) {
            return;
        }
        launchCalled = true;
        VMRunner.invoke(startupProgramName, null);
    }

    private StartupLauncher() {
    }
}
