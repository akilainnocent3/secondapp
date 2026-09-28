package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import android.database.CursorWindowAllocationException;
import android.os.Build;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.MainActivity;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public final class fkc implements Thread.UncaughtExceptionHandler {
    public final erb a;
    public final hp0 b;
    public final Thread.UncaughtExceptionHandler c;

    public fkc(hp0 hp0Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, erb erbVar) {
        this.b = hp0Var;
        this.c = uncaughtExceptionHandler;
        this.a = erbVar;
    }

    public final void a(int i) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.g("openMainPage(), exceptionType: %s", Integer.valueOf(i));
        hp0 hp0Var = this.b;
        Intent intent = new Intent(hp0Var, (Class<?>) MainActivity.class);
        intent.setFlags(268468224);
        intent.putExtra("tab", 0);
        intent.putExtra("extra_uncaught_exception", i);
        hp0Var.startActivity(intent);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a A[Catch: Exception -> 0x00c3, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c3, blocks: (B:3:0x000f, B:5:0x0013, B:38:0x00bf, B:6:0x001a, B:16:0x004a, B:19:0x0056, B:28:0x007a, B:22:0x005b, B:24:0x006a, B:26:0x0072, B:29:0x009b, B:31:0x009f, B:32:0x00ab, B:34:0x00af, B:36:0x00b3, B:37:0x00bc, B:9:0x0021, B:11:0x0025, B:13:0x0037, B:15:0x0043), top: B:47:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[Catch: NullPointerException -> 0x009b, Exception -> 0x00c3, TryCatch #0 {NullPointerException -> 0x009b, blocks: (B:22:0x005b, B:24:0x006a, B:26:0x0072), top: B:43:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:28:0x007a A[Catch: Exception -> 0x00c3, TRY_ENTER, TryCatch #2 {Exception -> 0x00c3, blocks: (B:3:0x000f, B:5:0x0013, B:38:0x00bf, B:6:0x001a, B:16:0x004a, B:19:0x0056, B:28:0x007a, B:22:0x005b, B:24:0x006a, B:26:0x0072, B:29:0x009b, B:31:0x009f, B:32:0x00ab, B:34:0x00af, B:36:0x00b3, B:37:0x00bc, B:9:0x0021, B:11:0x0025, B:13:0x0037, B:15:0x0043), top: B:47:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:43:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        int i;
        erb erbVar;
        hp0 hp0Var;
        String message;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.p(th, "uncaughtException", new Object[0]);
        try {
            if (th instanceof UnsatisfiedLinkError) {
                a(3001);
            } else if (h0j0.a() == null && (th instanceof RuntimeException)) {
                AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
                StringWriter stringWriter = new StringWriter();
                try {
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    th.printStackTrace(printWriter);
                    printWriter.close();
                } catch (Throwable unused) {
                }
                if (stringWriter.toString().contains("MissingWebViewPackageException")) {
                    a(3002);
                } else {
                    i = Build.VERSION.SDK_INT;
                    erbVar = this.a;
                    hp0Var = this.b;
                    if (i >= 33 || !(th instanceof CursorWindowAllocationException)) {
                        try {
                            message = th.getMessage();
                            Objects.requireNonNull(message);
                            if (!message.contains("Could not allocate CursorWindow") || (message.startsWith("Cursor window allocation of") && message.contains("failed"))) {
                                th.getClass();
                                itf0.a aVar2 = itf0.a;
                                aVar2.q("ICrashlyticsHelper");
                                aVar2.e(th);
                                erbVar.b(hp0Var, sn5.b(hp0Var, R.string.app_common__system_crash_dialog_error_title, new Object[0]), sn5.b(hp0Var, R.string.app_common__system_crash_dialog_error_message, new Object[0]));
                            } else if (th instanceof Resources.NotFoundException) {
                                itf0.a aVar3 = itf0.a;
                                aVar3.q("ICrashlyticsHelper");
                                aVar3.e(th);
                                erbVar.a(hp0Var);
                            } else {
                                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
                                if (uncaughtExceptionHandler != null) {
                                    if (th instanceof TimeoutException) {
                                        itf0.a aVar4 = itf0.a;
                                        aVar4.q("ICrashlyticsHelper");
                                        aVar4.e(th);
                                    } else {
                                        uncaughtExceptionHandler.uncaughtException(thread, th);
                                    }
                                }
                            }
                        } catch (NullPointerException unused2) {
                        }
                    } else {
                        th.getClass();
                        itf0.a aVar5 = itf0.a;
                        aVar5.q("ICrashlyticsHelper");
                        aVar5.e(th);
                        erbVar.b(hp0Var, sn5.b(hp0Var, R.string.app_common__system_crash_dialog_error_title, new Object[0]), sn5.b(hp0Var, R.string.app_common__system_crash_dialog_error_message, new Object[0]));
                    }
                }
            } else {
                i = Build.VERSION.SDK_INT;
                erbVar = this.a;
                hp0Var = this.b;
                if (i >= 33) {
                    message = th.getMessage();
                    Objects.requireNonNull(message);
                    if (message.contains("Could not allocate CursorWindow")) {
                    }
                    th.getClass();
                    itf0.a aVar6 = itf0.a;
                    aVar6.q("ICrashlyticsHelper");
                    aVar6.e(th);
                    erbVar.b(hp0Var, sn5.b(hp0Var, R.string.app_common__system_crash_dialog_error_title, new Object[0]), sn5.b(hp0Var, R.string.app_common__system_crash_dialog_error_message, new Object[0]));
                } else {
                    message = th.getMessage();
                    Objects.requireNonNull(message);
                    if (message.contains("Could not allocate CursorWindow")) {
                    }
                    th.getClass();
                    itf0.a aVar7 = itf0.a;
                    aVar7.q("ICrashlyticsHelper");
                    aVar7.e(th);
                    erbVar.b(hp0Var, sn5.b(hp0Var, R.string.app_common__system_crash_dialog_error_title, new Object[0]), sn5.b(hp0Var, R.string.app_common__system_crash_dialog_error_message, new Object[0]));
                }
            }
            System.exit(1);
        } catch (Exception unused3) {
        }
    }
}
