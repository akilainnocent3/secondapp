package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class cqh0 {

    @c0d(c = "com.sportygames.piggybash.presentation.component.matchmaking.UserReactionListKt$UserReactionList$1$1", f = "UserReactionList.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ SnapshotStateList<wph0> a;
        public final /* synthetic */ wph0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SnapshotStateList<wph0> snapshotStateList, wph0 wph0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = snapshotStateList;
            this.b = wph0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            SnapshotStateList<wph0> snapshotStateList;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            while (true) {
                snapshotStateList = this.a;
                if (snapshotStateList.size() <= 4) {
                    break;
                }
                p48.D(snapshotStateList);
            }
            wph0 wph0Var = this.b;
            if (wph0Var.a != Integer.MIN_VALUE) {
                if (snapshotStateList == null || !snapshotStateList.isEmpty()) {
                    Iterator<wph0> it = snapshotStateList.iterator();
                    while (it.hasNext()) {
                        if (it.next().a == wph0Var.a) {
                        }
                    }
                    snapshotStateList.add(0, wph0Var);
                } else {
                    snapshotStateList.add(0, wph0Var);
                }
            }
            return Unit.a;
        }
    }

    public static final class b implements Function1<Integer, Object> {
        public final /* synthetic */ wn9 a;
        public final /* synthetic */ List b;

        public b(wn9 wn9Var, List list) {
            this.a = wn9Var;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            int iIntValue = num.intValue();
            return this.a.invoke(Integer.valueOf(iIntValue), this.b.get(iIntValue));
        }
    }

    public static final class c implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public c(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class d implements iaj<gwr, Integer, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ SnapshotStateList b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;

        public d(List list, SnapshotStateList snapshotStateList, float f, float f2) {
            this.a = list;
            this.b = snapshotStateList;
            this.c = f;
            this.d = f2;
        }

        /* JADX WARN: Code duplicated, block: B:46:0x009a  */
        /* JADX WARN: Code duplicated, block: B:49:0x009f  */
        @Override // defpackage.iaj
        public final Unit d(gwr gwrVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            gwr gwrVar2 = gwrVar;
            int iIntValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= aVar2.d(iIntValue) ? 32 : 16;
            }
            if (aVar2.q(i & 1, (i & 147) != 146)) {
                wph0 wph0Var = (wph0) this.a.get(iIntValue);
                aVar2.N(1751687798);
                SnapshotStateList snapshotStateList = this.b;
                boolean zD = aVar2.d(snapshotStateList.size()) | ((((i & 112) ^ 48) > 32 && aVar2.d(iIntValue)) || (i & 48) == 32);
                Object objY = aVar2.y();
                if (zD || objY == androidx.compose.runtime.a.C0041a.a) {
                    int size = snapshotStateList.size();
                    float f = 1.0f;
                    if (size > 2) {
                        if (size != 3) {
                            if (size != 4) {
                                if (iIntValue == size - 1) {
                                    f = 0.0f;
                                } else if (iIntValue == size - 2) {
                                    f = 0.33f;
                                } else if (iIntValue == size - 3) {
                                    f = 0.66f;
                                }
                            } else if (iIntValue == 2) {
                                f = 0.66f;
                            } else if (iIntValue == 3) {
                                f = 0.33f;
                            }
                        } else if (iIntValue == 2) {
                            f = 0.66f;
                        }
                    }
                    objY = Float.valueOf(f);
                    aVar2.r(objY);
                }
                zph0.a(wph0Var, this.c, gwr.b(gwrVar2), ((Number) xe0.b(((Number) objY).floatValue(), null, "itemAlpha", null, aVar2, 3072, 22).getValue()).floatValue(), aVar2, 0);
                ty0.a(aVar2, j.i(androidx.compose.ui.d.a.b, this.d * 0.01f));
                aVar2.H();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final void a(final wph0 wph0Var, final float f, final float f2, androidx.compose.runtime.a aVar, final int i) {
        wph0Var.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-332761821);
        int i2 = (bVarI.M(wph0Var) ? 4 : 2) | i | (bVarI.c(f) ? 32 : 16) | (bVarI.c(f2) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new SnapshotStateList();
                bVarI.r(objY);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) objY;
            Integer numValueOf = Integer.valueOf(wph0Var.a);
            boolean z = (i2 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new a(snapshotStateList, wph0Var, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, numValueOf, (Function2) objY2);
            androidx.compose.ui.d dVarI = j.i(androidx.compose.ui.d.a.b, 0.225f * f2);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objY3 = bVarI.y();
            if (z2 || objY3 == c0042a) {
                objY3 = new Function1() { // from class: aqh0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        wn9 wn9Var = new wn9(1);
                        SnapshotStateList snapshotStateList2 = snapshotStateList;
                        szrVar.d(snapshotStateList2.size(), new cqh0.b(wn9Var, snapshotStateList2), new cqh0.c(snapshotStateList2), new op8(2039820996, new cqh0.d(snapshotStateList2, snapshotStateList2, f, f2), true));
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            aur.a(dVarI, null, null, true, null, null, null, false, null, (Function1) objY3, bVarI, 3072, 502);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, f2, i) { // from class: bqh0
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    cqh0.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
