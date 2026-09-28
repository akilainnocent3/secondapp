package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes8.dex */
public final class n8v implements MatchResult {
    public final Matcher a;
    public final CharSequence b;
    public final b c;
    public a d;

    public static final class a extends q3<String> {
        public a() {
        }

        @Override // defpackage.q2
        public final int b() {
            return n8v.this.a.groupCount() + 1;
        }

        @Override // defpackage.q2, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final Object get(int i) {
            String strGroup = n8v.this.a.group(i);
            return strGroup == null ? "" : strGroup;
        }

        @Override // defpackage.q3, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // defpackage.q3, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    public static final class b extends q2<MatchGroup> {
        public b() {
        }

        @Override // defpackage.q2
        public final int b() {
            return n8v.this.a.groupCount() + 1;
        }

        public final MatchGroup c(int i) {
            Matcher matcher = n8v.this.a;
            IntRange intRangeN = f.n(matcher.start(i), matcher.end(i));
            if (intRangeN.a < 0) {
                return null;
            }
            String strGroup = matcher.group(i);
            strGroup.getClass();
            return new MatchGroup(strGroup, intRangeN);
        }

        @Override // defpackage.q2, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof MatchGroup) {
                return super.contains((MatchGroup) obj);
            }
            return false;
        }

        @Override // defpackage.q2, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<MatchGroup> iterator() {
            return new ysg0.a(new ysg0(new u48(kotlin.collections.b.i(this)), new o8v(this, 0)));
        }
    }

    public n8v(Matcher matcher, CharSequence charSequence) {
        matcher.getClass();
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new b();
    }

    @Override // kotlin.text.MatchResult
    public final List<String> a() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.d = aVar2;
        return aVar2;
    }

    @Override // kotlin.text.MatchResult
    public final IntRange b() {
        Matcher matcher = this.a;
        return f.n(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String strGroup = this.a.group();
        strGroup.getClass();
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    public final n8v next() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(iEnd)) {
            return new n8v(matcher2, charSequence);
        }
        return null;
    }
}
