package com.sportybet.plugin.realsports.searchv2;

import android.os.Build;
import android.os.Bundle;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.android.gp.tz.R;
import defpackage.aqe0;
import defpackage.bb40;
import defpackage.c0d;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.elf;
import defpackage.h2m;
import defpackage.ib5;
import defpackage.op8;
import defpackage.qq1;
import defpackage.rlf;
import defpackage.t1p;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.ulf;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vx2;
import defpackage.wym;
import defpackage.y5b;
import defpackage.zn8;
import defpackage.zpe0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/plugin/realsports/searchv2/SearchActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "Lwym;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SearchActivity extends h2m implements rlf, bb40, wym {
    public static final /* synthetic */ int c = 0;
    public t1p b;

    @c0d(c = "com.sportybet.plugin.realsports.searchv2.SearchActivity$onCreate$1", f = "SearchActivity.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return SearchActivity.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            SearchActivity searchActivity = SearchActivity.this;
            if (i == 0) {
                uj50.b(obj);
                t1p t1pVar = searchActivity.b;
                if (t1pVar == null) {
                    Intrinsics.n("isNewSearchEnabledUseCase");
                    throw null;
                }
                this.a = 1;
                obj = qq1.k(t1pVar.a, BOConfigParam.NewSearchScreen, t1pVar.b.b().a(), this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                int i2 = SearchActivity.c;
                zpe0 zpe0Var = zpe0.a;
                elf.a(searchActivity, new aqe0(0, 0, 2, zpe0Var), new aqe0(0, 0, 2, zpe0Var));
                zn8.a(searchActivity, new op8(919830681, new vx2(searchActivity), true));
            } else {
                int i3 = SearchActivity.c;
                if (Build.VERSION.SDK_INT >= 35) {
                    ulf.b(searchActivity, searchActivity.getColor(R.color.colorPrimaryDark), searchActivity.getColor(R.color.background_general_primary), searchActivity.getColor(R.color.absolute_type3), null, 32);
                }
                searchActivity.setContentView(R.layout.spr_activity_old_search);
            }
            return Unit.a;
        }
    }

    @Override // defpackage.wym
    public final boolean k0() {
        return false;
    }

    @Override // defpackage.wym
    public final boolean o() {
        return false;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ej5.c(ebs.a(getLifecycle()), null, null, new a(null), 3);
    }

    @Override // defpackage.wym
    public final boolean y() {
        return false;
    }
}
