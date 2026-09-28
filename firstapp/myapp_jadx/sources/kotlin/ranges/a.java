package kotlin.ranges;

import defpackage.a87;
import defpackage.dhp;
import defpackage.sbz;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public class a implements Iterable<Character>, dhp {
    public static final C0774a c = new C0774a(null);
    public final char a;
    public final char b;

    /* JADX INFO: renamed from: kotlin.ranges.a$a, reason: collision with other inner class name */
    public static final class C0774a {
        public C0774a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public a(char c2, char c3) {
        this.a = c2;
        this.b = (char) sbz.a(c2, c3, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new a87(this.a, this.b);
    }
}
