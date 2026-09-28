package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import defpackage.hb5;
import defpackage.nm0;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class IntegrityServiceException extends nm0 {
    private final Throwable a;
    private final boolean b;
    private boolean c;
    private final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrityServiceException(int i, boolean z, Throwable th) {
        super(new Status(i, com.appsflyer.internal.h.a(i, "Integrity API error (", "): ", com.google.android.play.core.integrity.model.a.a(i), "."), null, null));
        Locale locale = Locale.ROOT;
        this.d = new Object();
        if (i == 0) {
            hb5.a("ErrorCode should not be 0.");
            throw null;
        }
        this.b = z;
        this.a = th;
    }

    public final void a(boolean z) {
        synchronized (this.d) {
            this.c = true;
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.d) {
            try {
                z = false;
                if (!this.c && this.b) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }

    public boolean isRemediable() {
        return this.b;
    }
}
