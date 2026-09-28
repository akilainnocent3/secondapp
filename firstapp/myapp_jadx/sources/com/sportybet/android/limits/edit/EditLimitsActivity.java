package com.sportybet.android.limits.edit;

import android.os.Bundle;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.limits.edit.EditLimitsActivity;
import defpackage.iuf;
import defpackage.nql;
import defpackage.op8;
import defpackage.p52;
import defpackage.r6b;
import defpackage.rcs;
import defpackage.ypf;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/limits/edit/EditLimitsActivity;", "Le22;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class EditLimitsActivity extends nql {
    public static final /* synthetic */ int i = 0;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        rcs.a aVar = rcs.b;
        String stringExtra = getIntent().getStringExtra("limit_type");
        aVar.getClass();
        rcs rcsVarA = rcs.a.a(stringExtra);
        if (rcsVarA == null) {
            rcsVarA = rcs.BETTING;
        }
        zn8.a(this, new op8(-358706860, new ypf(this, rcsVarA), true));
    }

    public final void z1(final rcs rcsVar, Function0<Unit> function0, Function0<Unit> function1, Function0<Unit> function2, a aVar, final int i2) {
        Function0<Unit> function3;
        final Function0<Unit> function4;
        final Function0<Unit> function5;
        b bVarI = aVar.i(-695891526);
        int i3 = (bVarI.d(rcsVar.ordinal()) ? 4 : 2) | i2 | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function2) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            int iOrdinal = rcsVar.ordinal();
            if (iOrdinal == 0) {
                function3 = function2;
                function4 = function1;
                function5 = function0;
                bVarI.N(502913896);
                r6b.b(function5, function4, function3, bVarI, (i3 >> 3) & 1022);
                bVarI.X(false);
            } else if (iOrdinal == 2) {
                function3 = function2;
                function4 = function1;
                function5 = function0;
                bVarI.N(503416747);
                p52.a(function5, function4, function3, bVarI, (i3 >> 3) & 1022);
                bVarI.X(false);
            } else if (iOrdinal != 3) {
                bVarI.N(503650053);
                bVarI.X(false);
                function3 = function2;
                function4 = function1;
                function5 = function0;
            } else {
                bVarI.N(503166763);
                function3 = function2;
                iuf.a(function0, function1, function3, null, bVarI, (i3 >> 3) & 1022);
                function5 = function0;
                function4 = function1;
                bVarI.X(false);
            }
        } else {
            function3 = function2;
            function4 = function1;
            function5 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function0<Unit> function6 = function3;
            eVarZ.d = new Function2(rcsVar, function5, function4, function6, i2) { // from class: cqf
                public final /* synthetic */ rcs b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    ((Integer) obj2).getClass();
                    int i4 = EditLimitsActivity.i;
                    this.a.z1(this.b, this.c, this.d, this.e, aVar2, qj40.a(33153));
                    return Unit.a;
                }
            };
        }
    }
}
