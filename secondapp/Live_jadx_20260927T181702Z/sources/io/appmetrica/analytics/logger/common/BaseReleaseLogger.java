package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseReleaseLogger {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile String f98810d = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f98811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f98812b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f98813c;

    public BaseReleaseLogger(@NonNull String str, @NonNull String str2) {
        this.f98813c = new c(new d(str), new a(), new b());
        this.f98811a = str2;
    }

    public static void init(@NonNull Context context) {
        f98810d = C4235d4.j.f61460d + context.getPackageName() + "] : ";
    }

    public void error(@Nullable String str, @Nullable Object... objArr) {
        if (this.f98812b) {
            c cVar = this.f98813c;
            String prefix = getPrefix();
            cVar.f98816b.getClass();
            for (String str2 : cVar.f98817c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f98815a.f98818a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }

    @NonNull
    public String getPrefix() {
        return f98810d + this.f98811a;
    }

    public void info(@Nullable String str, @Nullable Object... objArr) {
        if (this.f98812b) {
            c cVar = this.f98813c;
            String prefix = getPrefix();
            cVar.f98816b.getClass();
            for (String str2 : cVar.f98817c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f98815a.f98818a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(4, str3, str2);
            }
        }
    }

    public void setEnabled(boolean z10) {
        this.f98812b = z10;
    }

    public void warning(@Nullable String str, @Nullable Object... objArr) {
        if (this.f98812b) {
            c cVar = this.f98813c;
            String prefix = getPrefix();
            cVar.f98816b.getClass();
            for (String str2 : cVar.f98817c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f98815a.f98818a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(5, str3, str2);
            }
        }
    }

    public void error(@Nullable Throwable th2, @Nullable String str, @Nullable Object... objArr) {
        if (this.f98812b) {
            c cVar = this.f98813c;
            String prefix = getPrefix();
            cVar.f98816b.getClass();
            StringBuilder sb2 = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb2.append(Log.getStackTraceString(th2));
            for (String str2 : cVar.f98817c.a(a.a(prefix, sb2.toString(), objArr))) {
                String str3 = cVar.f98815a.f98818a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }
}
