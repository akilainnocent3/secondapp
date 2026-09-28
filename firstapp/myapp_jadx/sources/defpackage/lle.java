package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class lle {

    public static final class a implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ ifx a;
        public final /* synthetic */ vle b;
        public final /* synthetic */ et60 c;
        public final /* synthetic */ SnapshotStateList<ifx> d;
        public final /* synthetic */ vle.a e;

        public a(ifx ifxVar, vle vleVar, kt60 kt60Var, SnapshotStateList snapshotStateList, vle.a aVar) {
            this.a = ifxVar;
            this.b = vleVar;
            this.c = kt60Var;
            this.d = snapshotStateList;
            this.e = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 3) == 2 && aVar2.j()) {
                aVar2.G();
            } else {
                final ifx ifxVar = this.a;
                boolean zA = aVar2.A(ifxVar);
                final vle vleVar = this.b;
                boolean zA2 = zA | aVar2.A(vleVar);
                Object objY = aVar2.y();
                if (zA2 || objY == androidx.compose.runtime.a.C0041a.a) {
                    final SnapshotStateList<ifx> snapshotStateList = this.d;
                    objY = new Function1() { // from class: ile
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            SnapshotStateList snapshotStateList2 = snapshotStateList;
                            ifx ifxVar2 = ifxVar;
                            snapshotStateList2.add(ifxVar2);
                            return new kle(vleVar, ifxVar2, snapshotStateList2);
                        }
                    };
                    aVar2.r(objY);
                }
                xvf.c(ifxVar, (Function1) objY, aVar2);
                ip5.a(ifxVar, this.c, pp8.b(-497631156, new jle(this.e, ifxVar), aVar2), aVar2, 384);
            }
            return Unit.a;
        }
    }

    @c0d(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", l = {}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ vle b;
        public final /* synthetic */ SnapshotStateList<ifx> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ytw ytwVar, vle vleVar, SnapshotStateList snapshotStateList, v1b v1bVar) {
            super(2, v1bVar);
            this.a = ytwVar;
            this.b = vleVar;
            this.c = snapshotStateList;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.a, this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            for (ifx ifxVar : (Set) this.a.getValue()) {
                vle vleVar = this.b;
                if (!((List) vleVar.b().e.a.getValue()).contains(ifxVar) && !this.c.contains(ifxVar)) {
                    vleVar.b().b(ifxVar);
                }
            }
            return Unit.a;
        }
    }

    public static final class c implements tse {
        public final /* synthetic */ ifx a;
        public final /* synthetic */ hle b;

        public c(ifx ifxVar, hle hleVar) {
            this.a = ifxVar;
            this.b = hleVar;
        }

        @Override // defpackage.tse
        public final void dispose() {
            this.a.v.j.d(this.b);
        }
    }

    public static final void a(final vle vleVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(294589392);
        if ((((bVarI.A(vleVar) ? 4 : 2) | i) & 3) == 2 && bVarI.j()) {
            bVarI.G();
        } else {
            kt60 kt60VarA = i3k.a(bVarI);
            ytw ytwVarB = n95.b(vleVar.b().e, bVarI);
            List list = (List) ytwVarB.getValue();
            boolean zBooleanValue = ((Boolean) bVarI.O(hnn.a)).booleanValue();
            boolean zM = bVarI.M(list);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            Object obj = objY;
            if (zM || objY == c0042a) {
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    ifx ifxVar = (ifx) obj2;
                    if (zBooleanValue || ifxVar.v.j.d.compareTo(s9s.b.d) >= 0) {
                        arrayList.add(obj2);
                    }
                }
                snapshotStateList.addAll(arrayList);
                bVarI.r(snapshotStateList);
                obj = snapshotStateList;
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj;
            b(snapshotStateList2, (List) ytwVarB.getValue(), bVarI, 0);
            ytw ytwVarB2 = n95.b(vleVar.b().f, bVarI);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new SnapshotStateList();
                bVarI.r(objY2);
            }
            SnapshotStateList snapshotStateList3 = (SnapshotStateList) objY2;
            bVarI.N(-367418626);
            ListIterator listIterator = snapshotStateList2.listIterator();
            while (true) {
                dxd0 dxd0Var = (dxd0) listIterator;
                if (!dxd0Var.hasNext()) {
                    break;
                }
                final ifx ifxVar2 = (ifx) dxd0Var.next();
                ygx ygxVar = ifxVar2.b;
                ygxVar.getClass();
                vle.a aVar2 = (vle.a) ygxVar;
                boolean zA = bVarI.A(vleVar) | bVarI.A(ifxVar2);
                Object objY3 = bVarI.y();
                if (zA || objY3 == c0042a) {
                    objY3 = new Function0() { // from class: dle
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            vleVar.i(ifxVar2, false);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                u60.a((Function0) objY3, aVar2.i, pp8.b(1129586364, new a(ifxVar2, vleVar, kt60VarA, snapshotStateList3, aVar2), bVarI), bVarI, 384, 0);
            }
            bVarI.X(false);
            Set set = (Set) ytwVarB2.getValue();
            boolean zM2 = bVarI.M(ytwVarB2) | bVarI.A(vleVar);
            Object objY4 = bVarI.y();
            if (zM2 || objY4 == c0042a) {
                objY4 = new b(ytwVarB2, vleVar, snapshotStateList3, null);
                bVarI.r(objY4);
            }
            xvf.g(set, snapshotStateList3, (Function2) objY4, bVarI);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new ele(i, 0, vleVar);
        }
    }

    public static final void b(final List<ifx> list, final Collection<ifx> collection, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(1537894851);
        if ((((bVarI.A(list) ? 4 : 2) | i | (bVarI.A(collection) ? 32 : 16)) & 19) == 18 && bVarI.j()) {
            bVarI.G();
        } else {
            final boolean zBooleanValue = ((Boolean) bVarI.O(hnn.a)).booleanValue();
            for (final ifx ifxVar : collection) {
                kbs kbsVar = ifxVar.v.j;
                boolean zB = bVarI.b(zBooleanValue) | bVarI.A(list) | bVarI.A(ifxVar);
                Object objY = bVarI.y();
                if (zB || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new Function1() { // from class: fle
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r3v2, types: [hbs, hle] */
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
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            final ifx ifxVar2 = ifxVar;
                            final List list2 = list;
                            final boolean z = zBooleanValue;
                            ?? r3 = new cbs() { // from class: hle
                                @Override // defpackage.cbs
                                public final void F0(ibs ibsVar, s9s.a aVar2) {
                                    boolean z2 = z;
                                    List list3 = list2;
                                    ifx ifxVar3 = ifxVar2;
                                    if (z2 && !list3.contains(ifxVar3)) {
                                        list3.add(ifxVar3);
                                    }
                                    if (aVar2 == s9s.a.ON_START && !list3.contains(ifxVar3)) {
                                        list3.add(ifxVar3);
                                    }
                                    if (aVar2 == s9s.a.ON_STOP) {
                                        list3.remove(ifxVar3);
                                    }
                                }
                            };
                            ifxVar2.v.j.a(r3);
                            return new lle.c(ifxVar2, r3);
                        }
                    };
                    bVarI.r(objY);
                }
                xvf.c(kbsVar, (Function1) objY, bVarI);
            }
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(list, collection, i) { // from class: gle
                public final /* synthetic */ List a;
                public final /* synthetic */ Collection b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lle.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
