package defpackage;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class hmd implements Sequence<IntRange> {
    public final CharSequence a;
    public final int b;
    public final Function2<CharSequence, Integer, Pair<Integer, Integer>> c;

    public static final class a implements Iterator<IntRange>, dhp {
        public int a = -1;
        public int b;
        public int c;
        public IntRange d;
        public int e;

        public a() {
            int iE = f.e(0, 0, hmd.this.a.length());
            this.b = iE;
            this.c = iE;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001c  */
        /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:18:0x006f  */
        public final void b() {
            Pair<Integer, Integer> pairInvoke;
            hmd hmdVar = hmd.this;
            CharSequence charSequence = hmdVar.a;
            int i = this.c;
            if (i < 0) {
                this.a = 0;
                this.d = null;
                return;
            }
            int i2 = hmdVar.b;
            if (i2 > 0) {
                int i3 = this.e + 1;
                this.e = i3;
                if (i3 >= i2) {
                    this.d = new IntRange(this.b, StringsKt.R(charSequence), 1);
                    this.c = -1;
                } else if (i > charSequence.length() && (pairInvoke = hmdVar.c.invoke(charSequence, Integer.valueOf(this.c))) != null) {
                    int iIntValue = pairInvoke.a.intValue();
                    int iIntValue2 = pairInvoke.b.intValue();
                    this.d = f.n(this.b, iIntValue);
                    int i4 = iIntValue + iIntValue2;
                    this.b = i4;
                    this.c = i4 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.d = new IntRange(this.b, StringsKt.R(charSequence), 1);
                    this.c = -1;
                }
            } else if (i > charSequence.length()) {
                this.d = new IntRange(this.b, StringsKt.R(charSequence), 1);
                this.c = -1;
            } else {
                int iIntValue3 = pairInvoke.a.intValue();
                int iIntValue4 = pairInvoke.b.intValue();
                this.d = f.n(this.b, iIntValue3);
                int i5 = iIntValue3 + iIntValue4;
                this.b = i5;
                this.c = i5 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.a = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.a == -1) {
                b();
            }
            return this.a == 1;
        }

        @Override // java.util.Iterator
        public final IntRange next() {
            if (this.a == -1) {
                b();
            }
            if (this.a == 0) {
                lrh0.a();
                return null;
            }
            IntRange intRange = this.d;
            intRange.getClass();
            this.d = null;
            this.a = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public hmd(CharSequence charSequence, int i, Function2 function2) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = function2;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<IntRange> iterator() {
        return new a();
    }
}
