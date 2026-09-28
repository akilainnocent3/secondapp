package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class lft {

    @c0d(c = "com.sportygames.compose.lobbyv2.components.LogFullyVisibleLazyListItemsKt$LogFullyVisibleLazyListItems$1$1", f = "LogFullyVisibleLazyListItems.kt", l = {28}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;
        public final /* synthetic */ SnapshotStateSet<Integer> c;
        public final /* synthetic */ List<T> d;
        public final /* synthetic */ Function2<Integer, T, Unit> e;

        /* JADX INFO: renamed from: lft$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.compose.lobbyv2.components.LogFullyVisibleLazyListItemsKt$LogFullyVisibleLazyListItems$1$1$3", f = "LogFullyVisibleLazyListItems.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class C0812a extends tje0 implements Function2<List<? extends Integer>, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ SnapshotStateSet<Integer> b;
            public final /* synthetic */ List<T> c;
            public final /* synthetic */ Function2<Integer, T, Unit> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0812a(SnapshotStateSet<Integer> snapshotStateSet, List<? extends T> list, Function2<? super Integer, ? super T, Unit> function2, v1b<? super C0812a> v1bVar) {
                super(2, v1bVar);
                this.b = snapshotStateSet;
                this.c = list;
                this.d = function2;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0812a c0812a = new C0812a(this.b, this.c, this.d, v1bVar);
                c0812a.a = obj;
                return c0812a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<? extends Integer> list, v1b<? super Unit> v1bVar) {
                return ((C0812a) create(list, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                SnapshotStateSet<Integer> snapshotStateSet;
                List list = (List) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    snapshotStateSet = this.b;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it.next();
                    if (!snapshotStateSet.contains(new Integer(((Number) next).intValue()))) {
                        arrayList.add(next);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    int iIntValue = ((Number) obj2).intValue();
                    Object objV = CollectionsKt.V(iIntValue, this.c);
                    if (objV != null) {
                        this.d.invoke(new Integer(iIntValue), (T) objV);
                    }
                }
                snapshotStateSet.clear();
                snapshotStateSet.addAll(list);
                return Unit.a;
            }
        }

        public static final class b implements lyh<List<? extends Integer>> {
            public final /* synthetic */ or60 a;
            public final /* synthetic */ zzr b;

            /* JADX INFO: renamed from: lft$a$b$a, reason: collision with other inner class name */
            public static final class C0813a<T> implements myh {
                public final /* synthetic */ myh a;
                public final /* synthetic */ zzr b;

                /* JADX INFO: renamed from: lft$a$b$a$a, reason: collision with other inner class name */
                @c0d(c = "com.sportygames.compose.lobbyv2.components.LogFullyVisibleLazyListItemsKt$LogFullyVisibleLazyListItems$1$1$invokeSuspend$$inlined$map$1$2", f = "LogFullyVisibleLazyListItems.kt", l = {50}, m = "emit", v = 1)
                public static final class C0814a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C0814a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0813a.this.emit(null, this);
                    }
                }

                public C0813a(myh myhVar, zzr zzrVar) {
                    this.a = myhVar;
                    this.b = zzrVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    C0814a c0814a;
                    if (v1bVar instanceof C0814a) {
                        c0814a = (C0814a) v1bVar;
                        int i = c0814a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0814a.b = i - Integer.MIN_VALUE;
                        } else {
                            c0814a = new C0814a(v1bVar);
                        }
                    } else {
                        c0814a = new C0814a(v1bVar);
                    }
                    Object obj2 = c0814a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c0814a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        zzr zzrVar = this.b;
                        int iH = zzrVar.j().h();
                        int iF = zzrVar.j().f();
                        ArrayList arrayList = new ArrayList();
                        for (T t : (List) obj) {
                            zyr zyrVar = (zyr) t;
                            if (zyrVar.getOffset() >= iH) {
                                if (zyrVar.a() + zyrVar.getOffset() <= iF) {
                                    arrayList.add(t);
                                }
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj3 = arrayList.get(i3);
                            i3++;
                            bki0.a(((zyr) obj3).getIndex(), arrayList2);
                        }
                        c0814a.b = 1;
                        if (this.a.emit(arrayList2, c0814a) == y5bVar) {
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

            public b(or60 or60Var, zzr zzrVar) {
                this.a = or60Var;
                this.b = zzrVar;
            }

            @Override // defpackage.lyh
            public final Object collect(myh<? super List<? extends Integer>> myhVar, v1b v1bVar) throws Throwable {
                Object objCollect = this.a.collect(new C0813a(myhVar, this.b), v1bVar);
                return objCollect == y5b.a ? objCollect : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(zzr zzrVar, SnapshotStateSet<Integer> snapshotStateSet, List<? extends T> list, Function2<? super Integer, ? super T, Unit> function2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = zzrVar;
            this.c = snapshotStateSet;
            this.d = list;
            this.e = function2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, v1bVar);
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
                zzr zzrVar = this.b;
                lyh lyhVarB = uzh.b(new b(n95.c(new kft(zzrVar, 0)), zzrVar));
                C0812a c0812a = new C0812a(this.c, this.d, this.e, null);
                this.a = 1;
                if (kzh.b(lyhVarB, c0812a, this) == y5bVar) {
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

    public static final <T> void a(zzr zzrVar, List<? extends T> list, Function2<? super Integer, ? super T, Unit> function2, androidx.compose.runtime.a aVar, int i) {
        zzrVar.getClass();
        list.getClass();
        function2.getClass();
        b bVarI = aVar.i(183786226);
        int i2 = i | (bVarI.M(zzrVar) ? 4 : 2) | (bVarI.A(list) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new SnapshotStateSet();
                bVarI.r(objY);
            }
            SnapshotStateSet snapshotStateSet = (SnapshotStateSet) objY;
            boolean zA = ((i2 & 14) == 4) | bVarI.A(list) | ((i2 & 896) == 256);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                a aVar2 = new a(zzrVar, snapshotStateSet, list, function2, null);
                bVarI.r(aVar2);
                objY2 = aVar2;
            }
            xvf.e(bVarI, zzrVar, (Function2) objY2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new jft(i, 0, function2, zzrVar, list);
        }
    }
}
