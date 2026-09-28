package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.globalpay.AvailableChannel;
import com.sporty.android.core.model.pocket.globalpay.ChannelData;
import com.sporty.android.core.model.pocket.globalpay.TypeData;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsv;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sv extends j8i0 {
    public final v800 a;
    public final fp7 b;
    public final c0e c;
    public final psm d;
    public final yqm e;
    public final a f;
    public final wwd0 i;
    public final b v;
    public final ku90<lv> w;

    public static final class a implements lyh<ov> {
        public final /* synthetic */ f1i a;
        public final /* synthetic */ nv b;

        /* JADX INFO: renamed from: sv$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.globalpay.allpayments.AllPaymentsViewModel$special$$inlined$map$1", f = "AllPaymentsViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C1103a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1103a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ nv b;

            /* JADX INFO: renamed from: sv$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.globalpay.allpayments.AllPaymentsViewModel$special$$inlined$map$1$2", f = "AllPaymentsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1104a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1104a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, nv nvVar) {
                this.a = myhVar;
                this.b = nvVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws Throwable {
                C1104a c1104a;
                ov cVar;
                int i;
                Iterator<T> it;
                Throwable th;
                psm psmVar;
                Object obj2;
                UiText uiTextB;
                Iterator<T> it2;
                psm psmVar2;
                T next;
                if (v1bVar instanceof C1104a) {
                    c1104a = (C1104a) v1bVar;
                    int i2 = c1104a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1104a.b = i2 - Integer.MIN_VALUE;
                    } else {
                        c1104a = new C1104a(v1bVar);
                    }
                } else {
                    c1104a = new C1104a(v1bVar);
                }
                Object obj3 = c1104a.a;
                y5b y5bVar = y5b.a;
                int i3 = c1104a.b;
                Throwable th2 = null;
                if (i3 == 0) {
                    uj50.b(obj3);
                    AvailableChannel availableChannel = (AvailableChannel) obj;
                    nv nvVar = this.b;
                    psm psmVar3 = nvVar.a;
                    availableChannel.getClass();
                    if (availableChannel.getTypes().isEmpty()) {
                        cVar = ov.a.a;
                        i = 1;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        boolean zO = psmVar3.O();
                        List<TypeData> types = availableChannel.getTypes();
                        ArrayList arrayList = new ArrayList(l48.r(types, 10));
                        Iterator<T> it3 = types.iterator();
                        int i4 = 0;
                        int i5 = 0;
                        while (it3.hasNext()) {
                            T next2 = it3.next();
                            int i6 = i4 + 1;
                            if (i4 < 0) {
                                Throwable th3 = th2;
                                kotlin.collections.b.q();
                                throw th3;
                            }
                            TypeData typeData = (TypeData) next2;
                            List<ChannelData> channels = typeData.getChannels();
                            if (channels != null) {
                                th = th2;
                                ArrayList arrayList2 = new ArrayList();
                                int i7 = 0;
                                for (T t : channels) {
                                    int i8 = i7 + 1;
                                    if (i7 < 0) {
                                        kotlin.collections.b.q();
                                        throw th;
                                    }
                                    ChannelData channelData = (ChannelData) t;
                                    int id = channelData.getId();
                                    String name = channelData.getName();
                                    int id2 = channelData.getId();
                                    String bankCode = channelData.getBankCode();
                                    Iterator<T> it4 = c100.z.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            it2 = it3;
                                            psmVar2 = psmVar3;
                                            next = (T) th;
                                            break;
                                        }
                                        next = it4.next();
                                        it2 = it3;
                                        c100 c100Var = (c100) next;
                                        psmVar2 = psmVar3;
                                        if (c100Var.a == id2 && Intrinsics.g(c100Var.d, bankCode)) {
                                            break;
                                        }
                                        it3 = it2;
                                        psmVar3 = psmVar2;
                                    }
                                    c100 c100Var2 = next;
                                    int i9 = c100Var2 != null ? c100Var2.c : R.drawable.ic_payment_account;
                                    int i10 = zO ? i5 : i4;
                                    int i11 = zO ? 0 : i7;
                                    Map<Integer, d800> map = r67.a;
                                    int id3 = channelData.getId();
                                    c100 c100Var3 = c100.e;
                                    arrayList2.add(new b800(id, name, i9, i10, i11, id3 == 34001 || channelData.getId() == 31004, channelData.getId() == 34001 ? d800.a : r67.a.get(Integer.valueOf(channelData.getId()))));
                                    i5++;
                                    i7 = i8;
                                    it3 = it2;
                                    psmVar3 = psmVar2;
                                }
                                it = it3;
                                psmVar = psmVar3;
                                if (psmVar.O()) {
                                    String name2 = typeData.getName();
                                    uiTextB = Intrinsics.g(name2, "Bank Account") ? new ResourceUiText(R.string.za_provider_eft) : Intrinsics.g(name2, "Card") ? new ResourceUiText(R.string.za_provider_card) : new StringUiText(typeData.getName());
                                } else {
                                    uiTextB = nvVar.b.b(typeData);
                                }
                                Collection collection = (List) linkedHashMap.get(uiTextB);
                                if (collection == null) {
                                    collection = m2g.a;
                                }
                                linkedHashMap.put(uiTextB, CollectionsKt.i0(arrayList2, collection));
                                obj2 = Unit.a;
                            } else {
                                it = it3;
                                th = th2;
                                psmVar = psmVar3;
                                obj2 = th;
                            }
                            arrayList.add(obj2);
                            th2 = th;
                            i4 = i6;
                            it3 = it;
                            psmVar3 = psmVar;
                        }
                        cVar = new ov.c(new mv(linkedHashMap));
                        i = 1;
                    }
                    c1104a.b = i;
                    if (this.a.emit(cVar, c1104a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i3 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj3);
                }
                return Unit.a;
            }
        }

        public a(f1i f1iVar, nv nvVar) {
            this.a = f1iVar;
            this.b = nvVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super ov> myhVar, v1b v1bVar) {
            C1103a c1103a;
            if (v1bVar instanceof C1103a) {
                c1103a = (C1103a) v1bVar;
                int i = c1103a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1103a.b = i - Integer.MIN_VALUE;
                } else {
                    c1103a = new C1103a(v1bVar);
                }
            } else {
                c1103a = new C1103a(v1bVar);
            }
            Object obj = c1103a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1103a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c1103a.b = 1;
                if (this.a.collect(bVar, c1103a) == y5bVar) {
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

    public static final class b implements lyh<m0e> {
        public final /* synthetic */ v340 a;

        @c0d(c = "com.sportybet.android.globalpay.allpayments.AllPaymentsViewModel$special$$inlined$map$2", f = "AllPaymentsViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: sv$b$b, reason: collision with other inner class name */
        public static final class C1105b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: sv$b$b$a */
            @c0d(c = "com.sportybet.android.globalpay.allpayments.AllPaymentsViewModel$special$$inlined$map$2$2", f = "AllPaymentsViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return C1105b.this.emit(null, this);
                }
            }

            public C1105b(myh myhVar) {
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
                    m0e m0eVar = (m0e) obj;
                    if (m0eVar == null) {
                        m0eVar = m0e.CURRENT;
                    }
                    aVar.b = 1;
                    if (this.a.emit(m0eVar, aVar) == y5bVar) {
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

        public b(v340 v340Var) {
            this.a = v340Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.lyh
        public final Object collect(myh<? super m0e> myhVar, v1b v1bVar) {
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
                C1105b c1105b = new C1105b(myhVar);
                aVar.b = 1;
                if (this.a.a.collect(c1105b, aVar) == y5bVar) {
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

    public sv(nv nvVar, v800 v800Var, fp7 fp7Var, c0e c0eVar, psm psmVar, yqm yqmVar, ubk0 ubk0Var) {
        nvVar.getClass();
        v800Var.getClass();
        c0eVar.getClass();
        psmVar.getClass();
        yqmVar.getClass();
        ubk0Var.getClass();
        this.a = v800Var;
        this.b = fp7Var;
        this.c = c0eVar;
        this.d = psmVar;
        this.e = yqmVar;
        this.f = new a(v800Var.e, nvVar);
        this.i = xwd0.a(Boolean.FALSE);
        this.v = new b(ubk0Var.g);
        this.w = new ku90<>();
    }
}
