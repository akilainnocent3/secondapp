package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i3<T> implements Iterator<T> {
    public a a;
    public String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("READY", 0);
            a = aVar;
            a aVar2 = new a("NOT_READY", 1);
            b = aVar2;
            a aVar3 = new a("DONE", 2);
            c = aVar3;
            a aVar4 = new a("FAILED", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a aVar;
        String string;
        int i;
        z77 z77Var;
        a aVar2 = this.a;
        a aVar3 = a.d;
        if (aVar2 == aVar3) {
            fm20.a();
            return false;
        }
        int iOrdinal = aVar2.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.a = aVar3;
            eeb0.a aVar4 = (eeb0.a) this;
            int i2 = aVar4.e;
            while (true) {
                int length = aVar4.e;
                aVar = a.c;
                if (length == -1) {
                    aVar4.a = aVar;
                    string = null;
                    break;
                }
                ceb0 ceb0Var = (ceb0) aVar4;
                z77.b bVar = ceb0Var.i.a;
                CharSequence charSequence = ceb0Var.c;
                int length2 = charSequence.length();
                im20.f(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (bVar.a(charSequence.charAt(length))) {
                        break;
                    }
                    length++;
                }
                CharSequence charSequence2 = aVar4.c;
                if (length == -1) {
                    length = charSequence2.length();
                    aVar4.e = -1;
                    i = -1;
                } else {
                    i = length + 1;
                    aVar4.e = i;
                }
                if (i != i2) {
                    while (true) {
                        z77Var = aVar4.d;
                        if (i2 >= length || !z77Var.a(charSequence2.charAt(i2))) {
                            break;
                        }
                        i2++;
                    }
                    while (length > i2 && z77Var.a(charSequence2.charAt(length - 1))) {
                        length--;
                    }
                    int i3 = aVar4.f;
                    if (i3 == 1) {
                        length = charSequence2.length();
                        aVar4.e = -1;
                        while (length > i2 && z77Var.a(charSequence2.charAt(length - 1))) {
                            length--;
                        }
                    } else {
                        aVar4.f = i3 - 1;
                    }
                    string = charSequence2.subSequence(i2, length).toString();
                    break;
                }
                int i4 = i + 1;
                aVar4.e = i4;
                if (i4 > charSequence2.length()) {
                    aVar4.e = -1;
                }
            }
            this.b = string;
            if (this.a != aVar) {
                this.a = a.a;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            lrh0.a();
            return null;
        }
        this.a = a.b;
        T t = (T) this.b;
        this.b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
