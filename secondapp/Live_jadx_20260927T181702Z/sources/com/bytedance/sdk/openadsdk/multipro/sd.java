package com.bytedance.sdk.openadsdk.multipro;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.hnv;
import com.bytedance.sdk.component.utils.omn;
import com.ironsource.C4235d4;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {
    private static boolean hww = true;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static final AtomicBoolean f37504tq = new AtomicBoolean(false);

    public static void hww(Context context) {
        if (context != null && hww && f37504tq.compareAndSet(false, true)) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (hnv.hww(context)) {
                        tq(context);
                        return;
                    }
                    String strTq = hnv.tq(context);
                    try {
                        if (TextUtils.isEmpty(strTq)) {
                            strTq = context.getPackageName() + Process.myPid();
                        }
                        WebView.setDataDirectorySuffix(strTq);
                    } catch (IllegalStateException unused) {
                        hww(strTq);
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th2) {
                omn.vy(th2.getMessage(), new Object[0]);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[SYNTHETIC] */
    private static void tq(Context context) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel;
        Throwable th2;
        String strTq = tq();
        File file = new File(context.getDir(TextUtils.isEmpty(strTq) ? C4235d4.i.K : "webview_".concat(String.valueOf(strTq)), 0).getPath(), "webview_data.lock");
        file.getAbsolutePath();
        if (file.exists()) {
            FileChannel fileChannel = null;
            FileLock fileLockTryLock = null;
            fileChannel = null;
            fileChannel = null;
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    try {
                        channel = randomAccessFile.getChannel();
                        if (channel != null) {
                            try {
                                fileLockTryLock = channel.tryLock();
                            } catch (Exception unused) {
                                fileChannel = channel;
                                hww(file);
                                if (fileChannel != null) {
                                    try {
                                        fileChannel.close();
                                    } catch (Throwable th3) {
                                        th3.getMessage();
                                    }
                                }
                                if (randomAccessFile == null) {
                                    return;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                if (channel != null) {
                                    try {
                                        channel.close();
                                    } catch (Throwable th5) {
                                        th5.getMessage();
                                    }
                                }
                                if (randomAccessFile == null) {
                                    throw th2;
                                }
                                try {
                                    randomAccessFile.close();
                                    throw th2;
                                } catch (Throwable th6) {
                                    th6.getMessage();
                                    throw th2;
                                }
                            }
                        }
                        if (fileLockTryLock != null) {
                            fileLockTryLock.close();
                        } else {
                            hww(file);
                        }
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (Throwable th7) {
                                th7.getMessage();
                            }
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th8) {
                    th = th8;
                    channel = fileChannel;
                    th2 = th;
                    if (channel != null) {
                        channel.close();
                    }
                    if (randomAccessFile == null) {
                        throw th2;
                    }
                    randomAccessFile.close();
                    throw th2;
                }
            } catch (Exception unused3) {
                randomAccessFile = null;
            } catch (Throwable th9) {
                th = th9;
                randomAccessFile = null;
                channel = null;
                th2 = th;
                if (channel != null) {
                    channel.close();
                }
                if (randomAccessFile == null) {
                    throw th2;
                }
                randomAccessFile.close();
                throw th2;
            }
            try {
                randomAccessFile.close();
            } catch (Throwable th10) {
                th10.getMessage();
            }
        }
    }

    public static void hww() {
        hww = false;
    }

    private static void hww(String str) {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            Field field = (Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix");
            field.setAccessible(true);
            if (TextUtils.isEmpty((String) field.get(cls))) {
                field.set(cls, str);
            }
        } catch (Throwable unused) {
        }
    }

    private static void hww(File file) {
        hww(file, file.exists() ? file.delete() : false);
    }

    private static String tq() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            return (String) ((Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix")).get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void hww(File file, boolean z10) {
        if (!z10 || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e10) {
            omn.sd("TTAD.TTMultiInitHelper", e10.getMessage());
        }
    }
}
