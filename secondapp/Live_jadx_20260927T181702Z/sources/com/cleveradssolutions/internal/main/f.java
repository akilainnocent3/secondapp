package com.cleveradssolutions.internal.main;

import android.app.Application;
import android.content.Context;
import com.cleveradssolutions.internal.content.s;
import com.cleveradssolutions.internal.m;
import com.cleveradssolutions.internal.mediation.i;
import com.cleveradssolutions.internal.services.q;
import com.cleveradssolutions.internal.services.t;
import com.cleveradssolutions.internal.services.v;
import java.util.ArrayList;
import kotlin.jvm.internal.m0;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f43602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f43603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.cleveradssolutions.internal.services.g f43604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f43605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f43606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList[] f43607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f43608g;

    public f(s config, Application context) {
        m0.p(config, "config");
        m0.p(context, "context");
        this.f43602a = config;
        this.f43603b = new v();
        this.f43604c = new com.cleveradssolutions.internal.services.g();
        this.f43605d = new t();
        this.f43607f = new ArrayList[7];
        this.f43608g = new Object();
        String strM0 = config.m0();
        String strI = com.cleveradssolutions.internal.a.i(strM0);
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        c cVarC = b.c(context, strI, strM0);
        if (cVarC == null && (cVarC = b.a(context, strI, strM0)) == null) {
            cVarC = new c();
        }
        this.f43606e = cVarC;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v11 ??, new type: android.app.Application
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v11 ??, new type: android.app.Application
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v11 ??, new type: android.content.Context
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void c(com.cleveradssolutions.internal.main.f r24, com.cleveradssolutions.internal.content.d r25, double r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cleveradssolutions.internal.main.f.c(com.cleveradssolutions.internal.main.f, com.cleveradssolutions.internal.content.d, double):void");
    }

    public final t a() {
        return this.f43605d;
    }

    public final void b(final com.cleveradssolutions.internal.content.d data, final double d10) {
        m0.p(data, "data");
        q qVar = q.f43760b;
        q.f43777s++;
        if (data.d() > 0.0d) {
            q.f43778t = is.d.M0(data.d() * 1000.0d) + q.f43778t;
        }
        com.cleveradssolutions.sdk.base.c.f43997a.k(new Runnable() { // from class: com.cleveradssolutions.internal.main.e
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                f.c(this.f43599b, data, d10);
            }
        });
    }

    public final void d(com.cleveradssolutions.sdk.c format, com.cleveradssolutions.internal.mediation.b data) {
        m0.p(format, "format");
        m0.p(data, "data");
        synchronized (this.f43608g) {
            ArrayList arrayList = this.f43607f[format.j()];
            if (arrayList != null) {
                arrayList.remove(data);
            }
        }
        i iVar = this.f43602a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iVar.getLogTag());
        sb2.append(": ");
        sb2.append(data.getIdentifier() + " configuration disabled as invalid");
        sb2.append(' ');
        m.a(null, sb2, 5, "CAS.AI");
    }
}
