package io.appmetrica.analytics.logger.common;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseImportantLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f98809a;

    public BaseImportantLogger(@NonNull String str) {
        this.f98809a = new c(new d(str), new a(), new b());
    }

    public void info(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        c cVar = this.f98809a;
        cVar.f98816b.getClass();
        for (String str3 : cVar.f98817c.a(a.a(str, str2, objArr))) {
            String str4 = cVar.f98815a.f98818a;
            if (str3 == null) {
                str3 = "";
            }
            Log.println(4, str4, str3);
        }
    }
}
