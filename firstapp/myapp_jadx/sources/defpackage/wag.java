package defpackage;

import java.lang.Enum;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class wag<T extends Enum<T>> implements php<T> {
    public final T[] a;
    public final mpe0 b;

    public wag(final String str, T[] tArr) {
        str.getClass();
        tArr.getClass();
        this.a = tArr;
        this.b = hwr.b(new Function0() { // from class: vag
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Enum[] enumArr = this.a.a;
                sag sagVar = new sag(str, enumArr.length);
                for (Enum r0 : enumArr) {
                    sagVar.j(r0.name(), false);
                }
                return sagVar;
            }
        });
    }

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        int iB = b5dVar.B(getDescriptor());
        T[] tArr = this.a;
        if (iB >= 0 && iB < tArr.length) {
            return tArr[iB];
        }
        throw new ee80(iB + " is not among valid " + getDescriptor().h() + " enum values, values size is " + tArr.length);
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return (pd80) this.b.getValue();
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        T[] tArr = this.a;
        int iD = ay0.D(r5, tArr);
        if (iD != -1) {
            f4gVar.m(getDescriptor(), iD);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String strH = getDescriptor().h();
        String string = Arrays.toString(tArr);
        string.getClass();
        sb.append(" is not a valid enum ");
        sb.append(strH);
        sb.append(", must be one of ");
        sb.append(string);
        throw new ee80(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().h() + '>';
    }
}
