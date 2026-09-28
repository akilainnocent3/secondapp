package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class hev {

    @c0d(c = "com.sportybet.feature.profile.me.presentation.components.menu.MeMenuItemKt$MeMenuItem$1$1", f = "MeMenuItem.kt", l = {41}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ aev c;

        /* JADX INFO: renamed from: hev$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.profile.me.presentation.components.menu.MeMenuItemKt$MeMenuItem$1$1$1", f = "MeMenuItem.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class C0638a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ aev b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0638a(aev aevVar, v1b<? super C0638a> v1bVar) {
                super(2, v1bVar);
                this.b = aevVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0638a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0638a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    Function1<v1b<? super Unit>, Object> function1 = this.b.i;
                    this.a = 1;
                    if (function1.invoke(this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ibs ibsVar, aev aevVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = ibsVar;
            this.c = aevVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                aev aevVar = this.c;
                s9s.b bVar = aevVar.h;
                C0638a c0638a = new C0638a(aevVar, null);
                this.a = 1;
                if (m850.b(this.b, bVar, c0638a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final void a(final aev aevVar, final Function1<? super aev, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        function1.getClass();
        b bVarI = aVar.i(-793523741);
        int i2 = (bVarI.M(aevVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Function1<v1b<? super Unit>, Object> function2 = aevVar.i;
            aev.b bVar = aevVar.a;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (function2 == null || aevVar.h == null) {
                bVarI.N(-365393985);
                bVarI.X(false);
            } else {
                bVarI.N(-365621742);
                ibs ibsVar = (ibs) bVarI.O(ndt.a);
                boolean zA = bVarI.A(ibsVar) | ((i2 & 14) == 4);
                Object objY = bVarI.y();
                if (zA || objY == c0042a) {
                    objY = new a(ibsVar, aevVar, null);
                    bVarI.r(objY);
                }
                xvf.e(bVarI, ibsVar, (Function2) objY);
                bVarI.X(false);
            }
            d dVarH = g3w.h(d.a.b, bVar.a);
            if (bVar == aev.b.DAILY_STREAK) {
                mgv.a.getClass();
                dVarH = c9j.c(dVarH, AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "mepage_bettingstreak__entrance");
            }
            if (bVar == aev.b.RECAP) {
                dVarH = c9j.c(dVarH, AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "me__my_recap");
            }
            UiText uiText = aevVar.c;
            uiText.getClass();
            String strG = uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
            udv[] udvVarArr = udv.a;
            boolean z = aevVar.f;
            bVarI.N(-364688426);
            bVarI.X(false);
            boolean z2 = aevVar.d;
            boolean z3 = aevVar.g;
            op8 op8VarB = pp8.b(594075587, new Function2() { // from class: eev
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    aev aevVar2 = aevVar;
                    Integer num = aevVar2.b;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (!aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        aVar2.G();
                    } else if (num != null) {
                        aVar2.N(-1454351443);
                        crz crzVarA = erz.a(num.intValue(), 0, aVar2);
                        UiText uiText2 = aevVar2.c;
                        uiText2.getClass();
                        h6n.b(crzVarA, uiText2.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), j.r(d.a.b, 20.0f), c68.a(R.color.icon_primary, aVar2), aVar2, 384, 0);
                        aVar2.H();
                    } else {
                        aVar2.N(-1454074241);
                        aVar2.H();
                    }
                    return Unit.a;
                }
            }, bVarI);
            op8 op8VarB2 = pp8.b(1982109949, new Function2() { // from class: fev
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        fnv.a(aevVar.e, aVar2, 8);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            boolean z4 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objY2 = bVarI.y();
            if (z4 || objY2 == c0042a) {
                objY2 = new lac(1, aevVar, function1);
                bVarI.r(objY2);
            }
            xmv.b(strG, dVarH, op8VarB, 0L, z, z2, z3, null, op8VarB2, (Function0) objY2, bVarI, 805309488);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i) { // from class: gev
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    hev.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
