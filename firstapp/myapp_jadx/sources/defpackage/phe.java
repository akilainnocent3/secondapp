package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.patron.DeviceStatusDto;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lphe;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class phe extends j8i0 {
    public final p5k a;
    public final die b;
    public final iie c;
    public final rdd0 d;
    public final wwd0 e;
    public final wwd0 f;
    public final ku90<ffe> i;
    public final t340 v;
    public final wwd0 w;
    public final wwd0 y;
    public jvd0 z;

    @c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.DeviceManagementViewModel$loadDevices$1", f = "DeviceManagementViewModel.kt", l = {104}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: phe$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.DeviceManagementViewModel$loadDevices$1$1", f = "DeviceManagementViewModel.kt", l = {77}, m = "invokeSuspend", v = 2)
        public static final class C0969a extends tje0 implements gaj<Integer, Integer, v1b<? super gie>, Object> {
            public int a;
            public /* synthetic */ int b;
            public /* synthetic */ int c;
            public final /* synthetic */ phe d;
            public final /* synthetic */ List<DeviceStatusDto> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0969a(phe pheVar, List<? extends DeviceStatusDto> list, v1b<? super C0969a> v1bVar) {
                super(3, v1bVar);
                this.d = pheVar;
                this.e = list;
            }

            @Override // defpackage.gaj
            public final Object invoke(Integer num, Integer num2, v1b<? super gie> v1bVar) {
                int iIntValue = num.intValue();
                int iIntValue2 = num2.intValue();
                C0969a c0969a = new C0969a(this.d, this.e, v1bVar);
                c0969a.b = iIntValue;
                c0969a.c = iIntValue2;
                return c0969a.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Object objA;
                Object value;
                phe pheVar = this.d;
                wwd0 wwd0Var = pheVar.e;
                int i = this.b;
                int i2 = this.c;
                y5b y5bVar = y5b.a;
                int i3 = this.a;
                if (i3 == 0) {
                    uj50.b(obj);
                    p5k p5kVar = pheVar.a;
                    this.b = i;
                    this.c = i2;
                    this.a = 1;
                    objA = p5kVar.a.a(i2, i, this, this.e);
                    if (objA == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i3 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                    objA = obj;
                }
                gie gieVar = (gie) objA;
                if (i == 1 && ((ohe) wwd0Var.getValue()).f == cie.a) {
                    int i4 = gieVar.d;
                    String strValueOf = i4 > 99 ? "99+" : String.valueOf(i4);
                    StringUiText stringUiText = vch0.a;
                    ResourceUiText resourceUiText = new ResourceUiText(R.string.device_management__your_devices_label, ay0.S(new Object[]{strValueOf}));
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, ohe.a((ohe) value, resourceUiText, null, null, null, null, i4 > 1, 125)));
                }
                return gieVar;
            }
        }

        public static final /* synthetic */ class b extends pf implements Function2<mbe, v1b<? super eie>, Object> {
            /* JADX WARN: Code duplicated, block: B:20:0x0053  */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(mbe mbeVar, v1b<? super eie> v1bVar) {
                String str;
                int i;
                List listK;
                mbe mbeVar2 = mbeVar;
                ((die) this.a).getClass();
                mbeVar2.getClass();
                String str2 = mbeVar2.c;
                String str3 = mbeVar2.b;
                String str4 = mbeVar2.e;
                wk10 wk10Var = mbeVar2.g;
                String str5 = mbeVar2.f;
                int iOrdinal = wk10Var.ordinal();
                if (iOrdinal == 0) {
                    str = "Android";
                } else if (iOrdinal != 1) {
                    str = (iOrdinal == 2 || iOrdinal == 3) ? str5 : "Unknown";
                } else {
                    str = "iOS";
                }
                if (wk10Var == wk10.a || wk10Var == wk10.b) {
                    i = R.drawable.ic__mobile;
                } else {
                    String lowerCase = str5.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (StringsKt.M(lowerCase, "mobile", false)) {
                        i = R.drawable.ic__mobile;
                    } else {
                        i = R.drawable.ic__desktop;
                    }
                }
                String str6 = mbeVar2.a;
                String strG = bwf0.a.g(mbeVar2.i);
                aie aieVar = mbeVar2.h;
                Integer num = mbeVar2.d;
                int iOrdinal2 = aieVar.ordinal();
                if (iOrdinal2 == 0) {
                    listK = m2g.a;
                } else if (iOrdinal2 == 1) {
                    listK = kotlin.collections.b.k(obe.b.a, obe.a.a);
                } else if (iOrdinal2 == 2) {
                    listK = kotlin.collections.a.c(obe.a.a);
                } else {
                    if (iOrdinal2 != 3) {
                        uhc.a();
                        return null;
                    }
                    listK = kotlin.collections.a.c(obe.c.a);
                }
                return new eie(str2, str3, str4, str, i, str6, strG, aieVar, num, listK);
            }
        }

        @c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.DeviceManagementViewModel$loadDevices$1$3", f = "DeviceManagementViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class c extends tje0 implements gaj<myh<? super kqz<eie>>, Throwable, v1b<? super Unit>, Object> {
            public final /* synthetic */ phe a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(phe pheVar, v1b<? super c> v1bVar) {
                super(3, v1bVar);
                this.a = pheVar;
            }

            @Override // defpackage.gaj
            public final Object invoke(myh<? super kqz<eie>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
                return new c(this.a, v1bVar).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Object value;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                wwd0 wwd0Var = this.a.e;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, ohe.a((ohe) value, null, null, null, null, null, false, 254)));
                return Unit.a;
            }
        }

        @c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.DeviceManagementViewModel$loadDevices$1$4", f = "DeviceManagementViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class d extends tje0 implements Function2<kqz<eie>, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ phe b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(phe pheVar, v1b<? super d> v1bVar) {
                super(2, v1bVar);
                this.b = pheVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                d dVar = new d(this.b, v1bVar);
                dVar.a = obj;
                return dVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kqz<eie> kqzVar, v1b<? super Unit> v1bVar) {
                return ((d) create(kqzVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Object value;
                kqz kqzVar = (kqz) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                wwd0 wwd0Var = this.b.w;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, kqzVar));
                return Unit.a;
            }
        }

        public static final class e implements lyh<kqz<eie>> {
            public final /* synthetic */ lyh a;
            public final /* synthetic */ phe b;

            /* JADX INFO: renamed from: phe$a$e$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.DeviceManagementViewModel$loadDevices$1$invokeSuspend$$inlined$map$1", f = "DeviceManagementViewModel.kt", l = {109}, m = "collect", v = 2)
            public static final class C0970a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0970a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return e.this.collect(null, this);
                }
            }

            public static final class b<T> implements myh {
                public final /* synthetic */ myh a;
                public final /* synthetic */ phe b;

                /* JADX INFO: renamed from: phe$a$e$b$a, reason: collision with other inner class name */
                @c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.DeviceManagementViewModel$loadDevices$1$invokeSuspend$$inlined$map$1$2", f = "DeviceManagementViewModel.kt", l = {50}, m = "emit", v = 2)
                public static final class C0971a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C0971a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return b.this.emit(null, this);
                    }
                }

                public b(myh myhVar, phe pheVar) {
                    this.a = myhVar;
                    this.b = pheVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    C0971a c0971a;
                    if (v1bVar instanceof C0971a) {
                        c0971a = (C0971a) v1bVar;
                        int i = c0971a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0971a.b = i - Integer.MIN_VALUE;
                        } else {
                            c0971a = new C0971a(v1bVar);
                        }
                    } else {
                        c0971a = new C0971a(v1bVar);
                    }
                    Object obj2 = c0971a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c0971a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        kqz kqzVarB = vqz.b((kqz) obj, new b(2, this.b.b, die.class, "invoke", "invoke(Lcom/sportybet/feature/devicemanagement/impl/domain/Device;)Lcom/sportybet/feature/devicemanagement/impl/ui/DeviceUiModel;", 4));
                        c0971a.b = 1;
                        if (this.a.emit(kqzVarB, c0971a) == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i2 != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj2);
                    }
                    return Unit.a;
                }
            }

            public e(lyh lyhVar, phe pheVar) {
                this.a = lyhVar;
                this.b = pheVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.lyh
            public final Object collect(myh<? super kqz<eie>> myhVar, v1b v1bVar) {
                C0970a c0970a;
                if (v1bVar instanceof C0970a) {
                    c0970a = (C0970a) v1bVar;
                    int i = c0970a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0970a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0970a = new C0970a(v1bVar);
                    }
                } else {
                    c0970a = new C0970a(v1bVar);
                }
                Object obj = c0970a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0970a.b;
                if (i2 == 0) {
                    uj50.b(obj);
                    b bVar = new b(myhVar, this.b);
                    c0970a.b = 1;
                    if (this.a.collect(bVar, c0970a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return phe.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List listC;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                phe pheVar = phe.this;
                int iOrdinal = ((ohe) pheVar.e.getValue()).f.ordinal();
                if (iOrdinal == 0) {
                    listC = kotlin.collections.a.c(DeviceStatusDto.LOGIN);
                } else {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return null;
                    }
                    listC = kotlin.collections.b.k(DeviceStatusDto.LOGOUT, DeviceStatusDto.FORCE_LOGOUT, DeviceStatusDto.BLOCKED);
                }
                iie iieVar = pheVar.c;
                C0969a c0969a = new C0969a(pheVar, listC, null);
                iieVar.getClass();
                yzh yzhVar = new yzh(rs5.a(new e(new ymz(new joz(new hie(c0969a, 0), null), new iqz(10, 0, false, 10, 0, 54), null).e, pheVar), o8i0.d(pheVar)), new c(pheVar, null));
                d dVar = new d(pheVar, null);
                this.a = 1;
                if (kzh.b(yzhVar, dVar, this) == y5bVar) {
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

    public phe(p5k p5kVar, die dieVar, iie iieVar, rdd0 rdd0Var) {
        dieVar.getClass();
        rdd0Var.getClass();
        this.a = p5kVar;
        this.b = dieVar;
        this.c = iieVar;
        this.d = rdd0Var;
        wwd0 wwd0VarA = xwd0.a(new ohe(0));
        this.e = wwd0VarA;
        this.f = wwd0VarA;
        ku90<ffe> ku90Var = new ku90<>();
        this.i = ku90Var;
        this.v = e1i.a(ku90Var);
        wwd0 wwd0VarA2 = xwd0.a(new kqz(new gzh(new xmz.d(m2g.a)), kqz.e, kqz.f, lqz.a));
        this.w = wwd0VarA2;
        this.y = wwd0VarA2;
        y1();
        rdd0Var.a(na.a, k00.d);
    }

    public final void x1(afe afeVar) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        efe.b bVar;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        ohe oheVar;
        Object value10;
        boolean z = afeVar instanceof afe.h;
        wwd0 wwd0Var = this.e;
        if (z) {
            cie cieVar = ((afe.h) afeVar).a;
            do {
                value10 = wwd0Var.getValue();
            } while (!wwd0Var.g(value10, ohe.a((ohe) value10, null, null, null, cieVar, null, false, 95)));
            y1();
            return;
        }
        if (afeVar instanceof afe.j) {
            String str = ((afe.j) afeVar).a;
            do {
                value9 = wwd0Var.getValue();
                oheVar = (ohe) value9;
            } while (!wwd0Var.g(value9, ohe.a(oheVar, null, null, null, null, Intrinsics.g(oheVar.g, str) ? null : str, false, 191)));
            return;
        }
        boolean z2 = afeVar instanceof afe.b;
        rdd0 rdd0Var = this.d;
        if (z2) {
            String str2 = ((afe.b) afeVar).a;
            do {
                value8 = wwd0Var.getValue();
            } while (!wwd0Var.g(value8, ohe.a((ohe) value8, null, new efe.c(str2), null, null, null, false, 183)));
            rdd0Var.a(sa.a, k00.d);
            return;
        }
        if (afeVar instanceof afe.a) {
            String str3 = ((afe.a) afeVar).a;
            do {
                value7 = wwd0Var.getValue();
            } while (!wwd0Var.g(value7, ohe.a((ohe) value7, null, new efe.a(str3), null, null, null, false, 183)));
            rdd0Var.a(oa.a, k00.d);
            return;
        }
        if (afeVar instanceof afe.d) {
            String str4 = ((afe.d) afeVar).a;
            do {
                value6 = wwd0Var.getValue();
            } while (!wwd0Var.g(value6, ohe.a((ohe) value6, null, new efe.e(str4), null, null, null, false, 183)));
            rdd0Var.a(ua.a, k00.d);
            return;
        }
        if (afeVar instanceof afe.c) {
            rdd0Var.a(ma.a, k00.d);
            do {
                value5 = wwd0Var.getValue();
            } while (!wwd0Var.g(value5, ohe.a((ohe) value5, null, efe.d.a, null, null, null, false, 247)));
            rdd0Var.a(qa.a, k00.d);
            return;
        }
        if (!(afeVar instanceof afe.e)) {
            if (afeVar instanceof afe.f) {
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, ohe.a((ohe) value3, null, efe.b.a, null, null, null, false, 247)));
                return;
            }
            if (afeVar instanceof afe.i) {
                UiText uiText = ((afe.i) afeVar).a;
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, ohe.a((ohe) value2, null, null, new nhe.b(uiText), null, null, false, 239)));
                y1();
                return;
            }
            if (!(afeVar instanceof afe.g)) {
                uhc.a();
                return;
            } else {
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, ohe.a((ohe) value, null, null, nhe.a.a, null, null, false, 239)));
                return;
            }
        }
        efe efeVar = ((ohe) this.f.getValue()).d;
        do {
            value4 = wwd0Var.getValue();
            bVar = efe.b.a;
        } while (!wwd0Var.g(value4, ohe.a((ohe) value4, null, bVar, null, null, null, false, 247)));
        boolean z3 = efeVar instanceof efe.c;
        ku90<ffe> ku90Var = this.i;
        if (z3) {
            ku90Var.a(new ffe.a(dge.b.a, ((efe.c) efeVar).a));
            return;
        }
        if (efeVar instanceof efe.a) {
            ku90Var.a(new ffe.a(dge.a.a, ((efe.a) efeVar).a));
            return;
        }
        if (efeVar instanceof efe.e) {
            ku90Var.a(new ffe.a(dge.d.a, ((efe.e) efeVar).a));
        } else if (efeVar instanceof efe.d) {
            ku90Var.a(new ffe.a(dge.c.a, ""));
        } else {
            if (Intrinsics.g(efeVar, bVar)) {
                return;
            }
            uhc.a();
        }
    }

    public final void y1() {
        jvd0 jvd0Var = this.z;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.z = ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }
}
