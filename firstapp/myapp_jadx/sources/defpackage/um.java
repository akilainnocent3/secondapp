package defpackage;

import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes8.dex */
public final class um extends bjb0 {
    public final HashSet b;

    public um(List<e21<?>> list) {
        this.b = new HashSet(list);
    }

    @Override // defpackage.bjb0
    public final m21 e0(m21 m21Var) {
        if (!(m21Var instanceof ncn)) {
            final xw0 xw0Var = new xw0();
            m21Var.forEach(new BiConsumer() { // from class: gnh
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    xw0Var.b((e21) obj, obj2);
                }
            });
            m21Var = xw0Var.a();
        }
        if (!(m21Var instanceof ncn)) {
            ib5.a("Expected ImmutableKeyValuePairs based implementation of Attributes. This is a programming error.");
            return null;
        }
        Object[] objArr = ((ncn) m21Var).a;
        BitSet bitSet = m21Var.size() > 32 ? new BitSet(m21Var.size()) : null;
        int i = 0;
        int i2 = 0;
        int iHashCode = 1;
        for (int i3 = 0; i3 < objArr.length; i3 += 2) {
            int i4 = i3 / 2;
            if (this.b.contains(objArr[i3])) {
                iHashCode = objArr[i3 + 1].hashCode() + ((objArr[i3].hashCode() + (iHashCode * 31)) * 31);
                i++;
            } else if (bitSet != null) {
                bitSet.set(i4);
            } else {
                i2 |= 1 << i4;
            }
        }
        if (i == 0) {
            return vw0.d;
        }
        return bitSet != null ? new hnh.a(objArr, iHashCode, i, bitSet) : new hnh.b(objArr, iHashCode, i, i2);
    }

    public final String toString() {
        return "AdviceAttributesProcessor{attributeKeys=" + this.b + '}';
    }
}
