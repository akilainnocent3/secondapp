package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.tasks.Tasks;
import defpackage.cmk0;
import defpackage.dad;
import defpackage.hm20;
import defpackage.mwk0;
import defpackage.p1l0;
import defpackage.pfl0;
import defpackage.rph;
import defpackage.sph;
import defpackage.yoh;
import defpackage.yxk0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics c;
    public final p1l0 a;
    public cmk0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final /* synthetic */ a[] b;

        static {
            a aVar = new a("GRANTED", 0);
            a = aVar;
            b = new a[]{aVar, new a("DENIED", 1)};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final /* synthetic */ b[] e;

        static {
            b bVar = new b("AD_STORAGE", 0);
            a = bVar;
            b bVar2 = new b("ANALYTICS_STORAGE", 1);
            b = bVar2;
            b bVar3 = new b("AD_USER_DATA", 2);
            c = bVar3;
            b bVar4 = new b("AD_PERSONALIZATION", 3);
            d = bVar4;
            e = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) e.clone();
        }
    }

    public FirebaseAnalytics(p1l0 p1l0Var) {
        hm20.h(p1l0Var);
        this.a = p1l0Var;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (c == null) {
                        c = new FirebaseAnalytics(p1l0.e(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static pfl0 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        p1l0 p1l0VarE = p1l0.e(context, bundle);
        if (p1l0VarE == null) {
            return null;
        }
        return new mwk0(p1l0VarE);
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = rph.m;
            return (String) Tasks.await(((rph) yoh.c().b(sph.class)).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            dad.a(e);
            return null;
        } catch (ExecutionException e2) {
            dad.a(e2.getCause());
            return null;
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        zzdf zzdfVarG0 = zzdf.G0(activity);
        p1l0 p1l0Var = this.a;
        p1l0Var.getClass();
        p1l0Var.c(new yxk0(p1l0Var, zzdfVarG0, str, str2));
    }
}
