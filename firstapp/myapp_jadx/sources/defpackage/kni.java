package defpackage;

import com.sporty.android.core.model.loyalty.RewardShowOffData;
import com.sporty.android.core.model.loyalty.RewardShowOffUploadResult;
import java.io.IOException;
import java.net.HttpRetryException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class kni implements lyh<Unit> {
    public final /* synthetic */ yzh a;
    public final /* synthetic */ dni b;

    @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$uploadRewardShowOffData$$inlined$handleApiResult$default$1", f = "FootballViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return kni.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ dni b;

        @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$uploadRewardShowOffData$$inlined$handleApiResult$default$1$2", f = "FootballViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, dni dniVar) {
            this.a = myhVar;
            this.b = dniVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001d  */
        /* JADX WARN: Multi-variable type inference failed */
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
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            Object value;
            Object objA;
            RewardShowOffData rewardShowOffData;
            Object value2;
            Object objA2;
            dni dniVar = this.b;
            rdd0 rdd0Var = dniVar.i;
            wwd0 wwd0Var = dniVar.D;
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
            Integer intOrNull = null;
            if (i2 == 0) {
                uj50.b(obj2);
                lk50 lk50Var = (lk50) obj;
                if (lk50Var instanceof lk50.c) {
                    RewardShowOffUploadResult rewardShowOffUploadResult = (RewardShowOffUploadResult) ((lk50.c) lk50Var).a;
                    Object value3 = wwd0Var.getValue();
                    if (!(value3 instanceof smi.c)) {
                        value3 = null;
                    }
                    smi.c cVar = (smi.c) value3;
                    if (cVar != null && (rewardShowOffData = cVar.b) != null) {
                        RewardShowOffData rewardShowOffDataCopy$default = RewardShowOffData.copy$default(rewardShowOffData, false, null, null, null, null, null, null, null, rewardShowOffUploadResult.getRedirectCode(), 255, null);
                        do {
                            value2 = wwd0Var.getValue();
                            objA2 = (smi) value2;
                            smi.c cVar2 = (smi.c) (!(objA2 instanceof smi.c) ? null : objA2);
                            if (cVar2 != null) {
                                objA2 = smi.c.a(cVar2, rewardShowOffDataCopy$default, uxs.ENABLE, 1);
                            }
                        } while (!wwd0Var.g(value2, objA2));
                        dniVar.I.setValue(plh0.a.a);
                        rdd0Var.a(new gqt(true, null, null, 14), k00.d);
                    }
                } else if (lk50Var instanceof lk50.a) {
                    lk50.a aVar2 = (lk50.a) lk50Var;
                    Throwable th = aVar2.a;
                    itf0.a.d("uploadRewardShowOffData fail: " + aVar2.b, new Object[0]);
                    wwd0 wwd0Var2 = dniVar.C;
                    dbi.a aVar3 = new dbi.a(vch0.b);
                    wwd0Var2.getClass();
                    wwd0Var2.k(null, aVar3);
                    do {
                        value = wwd0Var.getValue();
                        objA = (smi) value;
                        smi.c cVar3 = (smi.c) (!(objA instanceof smi.c) ? null : objA);
                        if (cVar3 != null) {
                            objA = smi.c.a(cVar3, null, uxs.ENABLE, 3);
                        }
                    } while (!wwd0Var.g(value, objA));
                    th.getClass();
                    if (th instanceof tom) {
                        intOrNull = Integer.valueOf(((tom) th).a);
                    } else if (!(th instanceof IOException)) {
                        String message = th.getMessage();
                        if (message != null) {
                            Iterator<T> it = kotlin.collections.b.k(new Regex("HTTP (\\d{3})"), new Regex("Response code: (\\d{3})"), new Regex("Status: (\\d{3})"), new Regex("(\\d{3}) [A-Za-z]")).iterator();
                            while (it.hasNext()) {
                                n8v n8vVarB = ((Regex) it.next()).b(message);
                                if (n8vVarB != null) {
                                    intOrNull = StringsKt.toIntOrNull((String) ((n8v.a) n8vVarB.a()).get(1));
                                    break;
                                }
                            }
                        }
                    } else if (((IOException) th) instanceof HttpRetryException) {
                        intOrNull = Integer.valueOf(((HttpRetryException) th).responseCode());
                    }
                    if (intOrNull != null) {
                        rdd0Var.a(new gqt(false, intOrNull, th.getMessage(), 8), k00.d);
                    }
                } else if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                Unit unit = Unit.a;
                aVar.b = 1;
                if (this.a.emit(unit, aVar) == y5bVar) {
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

    public kni(yzh yzhVar, dni dniVar) {
        this.a = yzhVar;
        this.b = dniVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar, this.b);
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
