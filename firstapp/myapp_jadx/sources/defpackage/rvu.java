package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.notification.NotificationSetting;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lrvu;", "Lj8i0;", "a", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rvu extends j8i0 {
    public final r5b A;
    public final t340 B;
    public final v340 C;
    public final wwd0 D;
    public final r5b E;
    public final qa30 a;
    public final muu b;
    public final azm c;
    public String d;
    public final ku90<com.sporty.android.common.uievent.a> e;
    public final t340 f;
    public final r5b i;
    public final ku90<qvu> v;
    public final r5b w;
    public final wwd0 y;
    public final wwd0 z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes4.dex */
    public static final class a {
        public static final /* synthetic */ a[] a = {new a("LIVE", 0), new a("PRE_MATCH", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) a.clone();
        }
    }

    @c0d(c = "com.sporty.android.platform.features.settings.notification.matchalert.presentation.MatchAlertViewModel$checkAreNotificationsEnabled$1", f = "MatchAlertViewModel.kt", l = {160}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wwd0 a;
        public int b;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return rvu.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            wwd0 wwd0Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                rvu rvuVar = rvu.this;
                wwd0 wwd0Var2 = rvuVar.y;
                ku90<com.sporty.android.common.uievent.a> ku90Var = rvuVar.e;
                this.a = wwd0Var2;
                this.b = 1;
                obj = com.sporty.android.common.uievent.b.a(ku90Var, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                wwd0Var = wwd0Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wwd0Var = this.a;
                uj50.b(obj);
            }
            wwd0Var.setValue(obj);
            return Unit.a;
        }
    }

    public static final class c implements lyh<kqz<vde0>> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sporty.android.platform.features.settings.notification.matchalert.presentation.MatchAlertViewModel$special$$inlined$map$1", f = "MatchAlertViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sporty.android.platform.features.settings.notification.matchalert.presentation.MatchAlertViewModel$special$$inlined$map$1$2", f = "MatchAlertViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    kqz kqzVarB = vqz.b((kqz) obj, new e(2, null));
                    aVar.b = 1;
                    if (this.a.emit(kqzVarB, aVar) == y5bVar) {
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

        public c(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super kqz<vde0>> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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

    public static final class d implements lyh<Boolean> {
        public final /* synthetic */ v340 a;

        @c0d(c = "com.sporty.android.platform.features.settings.notification.matchalert.presentation.MatchAlertViewModel$special$$inlined$map$2", f = "MatchAlertViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return d.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sporty.android.platform.features.settings.notification.matchalert.presentation.MatchAlertViewModel$special$$inlined$map$2$2", f = "MatchAlertViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                NotificationSetting notificationSetting = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    lk50 lk50Var = (lk50) obj;
                    boolean enabled = false;
                    if (lk50Var instanceof lk50.c) {
                        for (T t : (Iterable) ((lk50.c) lk50Var).a) {
                            if (((NotificationSetting) t).getNotificationType() == 1) {
                                notificationSetting = t;
                                break;
                            }
                        }
                        NotificationSetting notificationSetting2 = notificationSetting;
                        if (notificationSetting2 != null) {
                            enabled = notificationSetting2.getEnabled();
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(enabled);
                    aVar.b = 1;
                    if (this.a.emit(boolValueOf, aVar) == y5bVar) {
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

        public d(v340 v340Var) {
            this.a = v340Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.a.collect(bVar, aVar) == y5bVar) {
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

    @c0d(c = "com.sporty.android.platform.features.settings.notification.matchalert.presentation.MatchAlertViewModel$subscribedEventUiStatesPagingData$1$1", f = "MatchAlertViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<jde0, v1b<? super vde0>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = new e(2, v1bVar);
            eVar.a = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jde0 jde0Var, v1b<? super vde0> v1bVar) {
            return ((e) create(jde0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jde0 jde0Var = (jde0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jde0Var.getClass();
            String str = jde0Var.a;
            Date date = jde0Var.b;
            String strA = oxc.a(jde0Var.d, " v ", jde0Var.e);
            StringUiText stringUiText = vch0.a;
            return new vde0(str, date, new StringUiText(strA), jde0Var.c);
        }
    }

    public rvu(qa30 qa30Var, muu muuVar, azm azmVar) {
        qa30Var.getClass();
        muuVar.getClass();
        azmVar.getClass();
        this.a = qa30Var;
        this.b = muuVar;
        this.c = azmVar;
        ku90<com.sporty.android.common.uievent.a> ku90Var = new ku90<>();
        this.e = ku90Var;
        this.f = e1i.a(ku90Var);
        this.i = i2i.c(ku90Var, null, 3);
        ku90<qvu> ku90Var2 = new ku90<>();
        this.v = ku90Var2;
        this.w = i2i.c(ku90Var2, null, 3);
        Boolean bool = Boolean.FALSE;
        this.y = xwd0.a(bool);
        wwd0 wwd0VarA = xwd0.a(bool);
        this.z = wwd0VarA;
        this.A = i2i.c(wwd0VarA, null, 3);
        this.B = rs5.a(new c(muuVar.d()), o8i0.d(this));
        lyh<lk50<List<NotificationSetting>>> lyhVarE = qa30Var.e(pu0.b.a);
        et7 et7VarD = o8i0.d(this);
        lk50.b bVar = lk50.b.a;
        kwd0 kwd0Var = q490.a.a;
        this.C = e1i.e(new d(e1i.e(lyhVarE, et7VarD, kwd0Var, bVar)), o8i0.d(this), kwd0Var, bool);
        wwd0 wwd0VarA2 = xwd0.a(tzs.a.a);
        this.D = wwd0VarA2;
        this.E = i2i.c(wwd0VarA2, null, 3);
    }

    public final c9p x1() {
        return ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }

    public final void y1() {
        ej5.c(o8i0.d(this), null, null, new uvu(this, null), 3);
    }
}
