package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdd;

/* JADX INFO: loaded from: classes4.dex */
public final class eyk0 extends h0l0 {
    public final /* synthetic */ Context e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ p1l0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyk0(p1l0 p1l0Var, Context context, Bundle bundle) {
        super(p1l0Var, true);
        this.e = context;
        this.f = bundle;
        this.i = p1l0Var;
    }

    @Override // defpackage.h0l0
    public final void a() {
        Boolean boolValueOf;
        try {
            Context context = this.e;
            hm20.h(context);
            String strA = g7l0.a(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strA)) {
                strA = g7l0.a(context);
            }
            int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strA);
            vvk0 vvk0VarAsInterface = null;
            if (identifier == 0) {
                boolValueOf = null;
            } else {
                try {
                    boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                } catch (Resources.NotFoundException unused) {
                    boolValueOf = null;
                }
            }
            p1l0 p1l0Var = this.i;
            try {
                vvk0VarAsInterface = tvk0.asInterface(DynamiteModule.c(context, boolValueOf == null || !boolValueOf.booleanValue() ? DynamiteModule.c : DynamiteModule.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.a e) {
                p1l0Var.d(e, true, false);
            }
            p1l0Var.f = vvk0VarAsInterface;
            if (p1l0Var.f == null) {
                Log.w("FA", "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
            int iD = DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false);
            zzdd zzddVar = new zzdd(133005L, Math.max(iA, iD), Boolean.TRUE.equals(boolValueOf) || iD < iA, this.f, g7l0.a(context));
            vvk0 vvk0Var = p1l0Var.f;
            hm20.h(vvk0Var);
            vvk0Var.initialize(new rcy(context), zzddVar, this.a);
        } catch (Exception e2) {
            this.i.d(e2, true, false);
        }
    }
}
