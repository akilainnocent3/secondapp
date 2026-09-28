package defpackage;

import com.sporty.android.core.model.cms.CMSResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class efk implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ efk(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j58 j58Var;
        j58 j58Var2;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                ArrayList arrayListA = kw5.a(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String value = ((CMSResponse) it.next()).getValue();
                    if (value != null) {
                        arrayListA.add(value);
                    }
                }
                return arrayListA;
            default:
                obj.getClass();
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                int i = j58.n;
                uv60 uv60Var = kx60.a;
                Boolean bool = Boolean.FALSE;
                Intrinsics.g(obj2, bool);
                if (obj2 != null) {
                    j58Var = Intrinsics.g(obj2, Boolean.FALSE) ? new j58(j58.m) : new j58(r58.b(((Integer) obj2).intValue()));
                } else {
                    j58Var = null;
                }
                j58Var.getClass();
                long j = j58Var.a;
                Object obj3 = list2.get(1);
                pmf0[] pmf0VarArr = omf0.b;
                Function1<Object, Object> function1 = kx60.s.b;
                Intrinsics.g(obj3, bool);
                omf0 omf0Var = obj3 != null ? (omf0) function1.invoke(obj3) : null;
                omf0Var.getClass();
                long j2 = omf0Var.a;
                Object obj4 = list2.get(2);
                t9i t9iVar = t9i.b;
                t9i t9iVar2 = (Intrinsics.g(obj4, bool) || obj4 == null) ? null : (t9i) kx60.n.b.invoke(obj4);
                Object obj5 = list2.get(3);
                n9i n9iVar = obj5 != null ? (n9i) obj5 : null;
                Object obj6 = list2.get(4);
                o9i o9iVar = obj6 != null ? (o9i) obj6 : null;
                Object obj7 = list2.get(6);
                String str = obj7 != null ? (String) obj7 : null;
                Object obj8 = list2.get(7);
                Intrinsics.g(obj8, bool);
                omf0 omf0Var2 = obj8 != null ? (omf0) function1.invoke(obj8) : null;
                omf0Var2.getClass();
                long j3 = omf0Var2.a;
                Object obj9 = list2.get(8);
                t82 t82Var = (Intrinsics.g(obj9, bool) || obj9 == null) ? null : (t82) kx60.o.b.invoke(obj9);
                Object obj10 = list2.get(9);
                ljf0 ljf0Var = (Intrinsics.g(obj10, bool) || obj10 == null) ? null : (ljf0) kx60.l.b.invoke(obj10);
                Object obj11 = list2.get(10);
                cet cetVar = cet.c;
                cet cetVar2 = (Intrinsics.g(obj11, bool) || obj11 == null) ? null : (cet) kx60.u.b.invoke(obj11);
                Object obj12 = list2.get(11);
                Intrinsics.g(obj12, bool);
                t9i t9iVar3 = t9iVar2;
                if (obj12 != null) {
                    j58Var2 = Intrinsics.g(obj12, Boolean.FALSE) ? new j58(j58.m) : new j58(r58.b(((Integer) obj12).intValue()));
                } else {
                    j58Var2 = null;
                }
                j58Var2.getClass();
                long j4 = j58Var2.a;
                Object obj13 = list2.get(12);
                yef0 yef0Var = (Intrinsics.g(obj13, bool) || obj13 == null) ? null : (yef0) kx60.k.b.invoke(obj13);
                Object obj14 = list2.get(13);
                ix80 ix80Var = ix80.d;
                return new ora0(j, j2, t9iVar3, n9iVar, o9iVar, (f8i) null, str, j3, t82Var, ljf0Var, cetVar2, j4, yef0Var, (Intrinsics.g(obj14, bool) || obj14 == null) ? null : (ix80) kx60.q.b.invoke(obj14), 49184);
        }
    }
}
