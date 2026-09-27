package mq;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class m7 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.l
    public static final b f111782j = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oy.l
    public static final Expression<kp> f111783k = Expression.Companion.constant$default(Expression.Companion, kp.NONE, null, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oy.l
    public static final ds.p<ParsingEnvironment, JSONObject, m7> f111784l = a.f111794g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @cs.g
    @oy.m
    public final List<ca> f111785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    @cs.g
    public final String f111786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    @cs.g
    public final List<c> f111787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @cs.g
    @oy.m
    public final List<oo> f111788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public final Expression<kp> f111789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @cs.g
    @oy.m
    public final List<mp> f111790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @cs.g
    @oy.m
    public final List<tp> f111791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @cs.g
    @oy.m
    public final List<Exception> f111792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.m
    public Integer f111793i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.p<ParsingEnvironment, JSONObject, m7> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f111794g = new a();

        public a() {
            super(2);
        }

        @Override // ds.p
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m7 invoke(@oy.l ParsingEnvironment parsingEnvironment, @oy.l JSONObject jSONObject) {
            return m7.f111782j.a(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.x xVar) {
            this();
        }

        @cs.j(name = "fromJson")
        @oy.l
        @cs.o
        public final m7 a(@oy.l ParsingEnvironment parsingEnvironment, @oy.l JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().E2().getValue().a(parsingEnvironment, jSONObject);
        }

        @oy.l
        public final ds.p<ParsingEnvironment, JSONObject, m7> b() {
            return m7.f111784l;
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        public static final b f111795d = new b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oy.l
        public static final ds.p<ParsingEnvironment, JSONObject, c> f111796e = a.f111800g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        @cs.g
        public final e0 f111797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @cs.g
        public final long f111798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.m
        public Integer f111799c;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a extends kotlin.jvm.internal.o0 implements ds.p<ParsingEnvironment, JSONObject, c> {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final a f111800g = new a();

            public a() {
                super(2);
            }

            @Override // ds.p
            @oy.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(@oy.l ParsingEnvironment parsingEnvironment, @oy.l JSONObject jSONObject) {
                return c.f111795d.a(parsingEnvironment, jSONObject);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.x xVar) {
                this();
            }

            @cs.j(name = "fromJson")
            @oy.l
            @cs.o
            public final c a(@oy.l ParsingEnvironment parsingEnvironment, @oy.l JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().H2().getValue().deserialize(parsingEnvironment, jSONObject);
            }

            @oy.l
            public final ds.p<ParsingEnvironment, JSONObject, c> b() {
                return c.f111796e;
            }

            public b() {
            }
        }

        @DivModelInternalApi
        public c(@oy.l e0 e0Var, long j10) {
            this.f111797a = e0Var;
            this.f111798b = j10;
        }

        public static /* synthetic */ c c(c cVar, e0 e0Var, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                e0Var = cVar.f111797a;
            }
            if ((i10 & 2) != 0) {
                j10 = cVar.f111798b;
            }
            return cVar.b(e0Var, j10);
        }

        @cs.j(name = "fromJson")
        @oy.l
        @cs.o
        public static final c e(@oy.l ParsingEnvironment parsingEnvironment, @oy.l JSONObject jSONObject) {
            return f111795d.a(parsingEnvironment, jSONObject);
        }

        @oy.l
        public final c b(@oy.l e0 e0Var, long j10) {
            return new c(e0Var, j10);
        }

        public final boolean d(@oy.m c cVar, @oy.l ExpressionResolver expressionResolver, @oy.l ExpressionResolver expressionResolver2) {
            return cVar != null && this.f111797a.b(cVar.f111797a, expressionResolver, expressionResolver2) && this.f111798b == cVar.f111798b;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f111799c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.m1.d(c.class).hashCode() + this.f111797a.hash() + f0.p.a(this.f111798b);
            this.f111799c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.data.Hashable
        public /* synthetic */ int propertiesHash() {
            return iq.c.a(this);
        }

        @Override // com.yandex.div.json.JSONSerializable
        @oy.l
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().H2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public m7(@oy.m List<ca> list, @oy.l String str, @oy.l List<c> list2, @oy.m List<oo> list3, @oy.l Expression<kp> expression, @oy.m List<mp> list4, @oy.m List<? extends tp> list5, @oy.m List<? extends Exception> list6) {
        this.f111785a = list;
        this.f111786b = str;
        this.f111787c = list2;
        this.f111788d = list3;
        this.f111789e = expression;
        this.f111790f = list4;
        this.f111791g = list5;
        this.f111792h = list6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m7 c(m7 m7Var, List list, String str, List list2, List list3, Expression expression, List list4, List list5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = m7Var.f111785a;
        }
        if ((i10 & 2) != 0) {
            str = m7Var.f111786b;
        }
        if ((i10 & 4) != 0) {
            list2 = m7Var.f111787c;
        }
        if ((i10 & 8) != 0) {
            list3 = m7Var.f111788d;
        }
        if ((i10 & 16) != 0) {
            expression = m7Var.f111789e;
        }
        if ((i10 & 32) != 0) {
            list4 = m7Var.f111790f;
        }
        if ((i10 & 64) != 0) {
            list5 = m7Var.f111791g;
        }
        List list6 = list4;
        List list7 = list5;
        Expression expression2 = expression;
        List list8 = list2;
        return m7Var.b(list, str, list8, list3, expression2, list6, list7);
    }

    @cs.j(name = "fromJson")
    @oy.l
    @cs.o
    public static final m7 e(@oy.l ParsingEnvironment parsingEnvironment, @oy.l JSONObject jSONObject) {
        return f111782j.a(parsingEnvironment, jSONObject);
    }

    @oy.l
    public final m7 b(@oy.m List<ca> list, @oy.l String str, @oy.l List<c> list2, @oy.m List<oo> list3, @oy.l Expression<kp> expression, @oy.m List<mp> list4, @oy.m List<? extends tp> list5) {
        return new m7(list, str, list2, list3, expression, list4, list5, null, 128, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:106:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089 A[LOOP:1: B:31:0x0068->B:39:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8 A[LOOP:2: B:49:0x00a7->B:57:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e4 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:75:0x0106  */
    /* JADX WARN: Code duplicated, block: B:79:0x0118 A[LOOP:3: B:71:0x00f8->B:79:0x0118, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x011a  */
    /* JADX WARN: Code duplicated, block: B:82:0x011e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0124  */
    /* JADX WARN: Code duplicated, block: B:85:0x0126 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x0127  */
    /* JADX WARN: Code duplicated, block: B:92:0x013f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0147  */
    /* JADX WARN: Code duplicated, block: B:98:0x0159 A[LOOP:4: B:90:0x0139->B:98:0x0159, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x015b A[DONT_INVERT] */
    public final boolean d(@oy.m m7 m7Var, @oy.l ExpressionResolver expressionResolver, @oy.l ExpressionResolver expressionResolver2) {
        List<c> list;
        List<c> list2;
        int i10;
        List<oo> list3;
        List<mp> list4;
        List<tp> list5;
        List<tp> list6;
        int i11;
        int i12;
        List<mp> list7;
        int i13;
        int i14;
        List<oo> list8;
        int i15;
        int i16;
        int i17;
        if (m7Var == null) {
            return false;
        }
        List<ca> list9 = this.f111785a;
        if (list9 != null) {
            List<ca> list10 = m7Var.f111785a;
            if (list10 != null && list9.size() == list10.size()) {
                int i18 = 0;
                for (Object obj : list9) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        fr.h0.b0();
                    }
                    if (((ca) obj).d(list10.get(i18), expressionResolver, expressionResolver2)) {
                        i18 = i19;
                    }
                }
                if (kotlin.jvm.internal.m0.g(this.f111786b, m7Var.f111786b)) {
                    list = this.f111787c;
                    list2 = m7Var.f111787c;
                    if (list.size() == list2.size()) {
                        i10 = 0;
                        for (Object obj2 : list) {
                            i17 = i10 + 1;
                            if (i10 < 0) {
                                fr.h0.b0();
                            }
                            if (!((c) obj2).d(list2.get(i10), expressionResolver, expressionResolver2)) {
                                i10 = i17;
                            }
                        }
                        list3 = this.f111788d;
                        if (list3 != null) {
                            list8 = m7Var.f111788d;
                            if (list8 == null && list3.size() == list8.size()) {
                                i15 = 0;
                                for (Object obj3 : list3) {
                                    i16 = i15 + 1;
                                    if (i15 < 0) {
                                        fr.h0.b0();
                                    }
                                    if (!((oo) obj3).d(list8.get(i15), expressionResolver, expressionResolver2)) {
                                        i15 = i16;
                                    }
                                }
                                if (this.f111789e.evaluate(expressionResolver) == m7Var.f111789e.evaluate(expressionResolver2)) {
                                    list4 = this.f111790f;
                                    if (list4 != null) {
                                        list7 = m7Var.f111790f;
                                        if (list7 == null && list4.size() == list7.size()) {
                                            i13 = 0;
                                            for (Object obj4 : list4) {
                                                i14 = i13 + 1;
                                                if (i13 < 0) {
                                                    fr.h0.b0();
                                                }
                                                if (!((mp) obj4).d(list7.get(i13), expressionResolver, expressionResolver2)) {
                                                    i13 = i14;
                                                }
                                            }
                                            list5 = this.f111791g;
                                            list6 = m7Var.f111791g;
                                            if (list5 != null) {
                                                if (list6 == null && list5.size() == list6.size()) {
                                                    i11 = 0;
                                                    for (Object obj5 : list5) {
                                                        i12 = i11 + 1;
                                                        if (i11 < 0) {
                                                            fr.h0.b0();
                                                        }
                                                        if (!((tp) obj5).b(list6.get(i11), expressionResolver, expressionResolver2)) {
                                                            i11 = i12;
                                                        }
                                                    }
                                                    return true;
                                                }
                                            } else if (list6 == null) {
                                                return true;
                                            }
                                        }
                                    } else if (m7Var.f111790f == null) {
                                        list5 = this.f111791g;
                                        list6 = m7Var.f111791g;
                                        if (list5 != null) {
                                            if (list6 == null) {
                                                return false;
                                            }
                                            i11 = 0;
                                            while (r1.hasNext()) {
                                                i12 = i11 + 1;
                                                if (i11 < 0) {
                                                    fr.h0.b0();
                                                }
                                                if (!((tp) obj5).b(list6.get(i11), expressionResolver, expressionResolver2)) {
                                                    i11 = i12;
                                                }
                                            }
                                            return true;
                                        }
                                        if (list6 == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        } else if (m7Var.f111788d == null) {
                            if (this.f111789e.evaluate(expressionResolver) == m7Var.f111789e.evaluate(expressionResolver2)) {
                                list4 = this.f111790f;
                                if (list4 != null) {
                                    list7 = m7Var.f111790f;
                                    if (list7 == null) {
                                        return false;
                                    }
                                    i13 = 0;
                                    while (r1.hasNext()) {
                                        i14 = i13 + 1;
                                        if (i13 < 0) {
                                            fr.h0.b0();
                                        }
                                        if (!((mp) obj4).d(list7.get(i13), expressionResolver, expressionResolver2)) {
                                            i13 = i14;
                                        }
                                    }
                                    list5 = this.f111791g;
                                    list6 = m7Var.f111791g;
                                    if (list5 != null) {
                                        if (list6 == null) {
                                            return false;
                                        }
                                        i11 = 0;
                                        while (r1.hasNext()) {
                                            i12 = i11 + 1;
                                            if (i11 < 0) {
                                                fr.h0.b0();
                                            }
                                            if (!((tp) obj5).b(list6.get(i11), expressionResolver, expressionResolver2)) {
                                                i11 = i12;
                                            }
                                        }
                                        return true;
                                    }
                                    if (list6 == null) {
                                        return true;
                                    }
                                } else if (m7Var.f111790f == null) {
                                    list5 = this.f111791g;
                                    list6 = m7Var.f111791g;
                                    if (list5 != null) {
                                        if (list6 == null) {
                                            return false;
                                        }
                                        i11 = 0;
                                        while (r1.hasNext()) {
                                            i12 = i11 + 1;
                                            if (i11 < 0) {
                                                fr.h0.b0();
                                            }
                                            if (!((tp) obj5).b(list6.get(i11), expressionResolver, expressionResolver2)) {
                                                i11 = i12;
                                            }
                                        }
                                        return true;
                                    }
                                    if (list6 == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (m7Var.f111785a == null) {
            if (kotlin.jvm.internal.m0.g(this.f111786b, m7Var.f111786b)) {
                list = this.f111787c;
                list2 = m7Var.f111787c;
                if (list.size() == list2.size()) {
                    i10 = 0;
                    while (r1.hasNext()) {
                        i17 = i10 + 1;
                        if (i10 < 0) {
                            fr.h0.b0();
                        }
                        if (!((c) obj2).d(list2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i17;
                        }
                    }
                    list3 = this.f111788d;
                    if (list3 != null) {
                        list8 = m7Var.f111788d;
                        if (list8 == null) {
                            return false;
                        }
                        i15 = 0;
                        while (r1.hasNext()) {
                            i16 = i15 + 1;
                            if (i15 < 0) {
                                fr.h0.b0();
                            }
                            if (!((oo) obj3).d(list8.get(i15), expressionResolver, expressionResolver2)) {
                                i15 = i16;
                            }
                        }
                        if (this.f111789e.evaluate(expressionResolver) == m7Var.f111789e.evaluate(expressionResolver2)) {
                            list4 = this.f111790f;
                            if (list4 != null) {
                                list7 = m7Var.f111790f;
                                if (list7 == null) {
                                    return false;
                                }
                                i13 = 0;
                                while (r1.hasNext()) {
                                    i14 = i13 + 1;
                                    if (i13 < 0) {
                                        fr.h0.b0();
                                    }
                                    if (!((mp) obj4).d(list7.get(i13), expressionResolver, expressionResolver2)) {
                                        i13 = i14;
                                    }
                                }
                                list5 = this.f111791g;
                                list6 = m7Var.f111791g;
                                if (list5 != null) {
                                    if (list6 == null) {
                                        return false;
                                    }
                                    i11 = 0;
                                    while (r1.hasNext()) {
                                        i12 = i11 + 1;
                                        if (i11 < 0) {
                                            fr.h0.b0();
                                        }
                                        if (!((tp) obj5).b(list6.get(i11), expressionResolver, expressionResolver2)) {
                                            i11 = i12;
                                        }
                                    }
                                    return true;
                                }
                                if (list6 == null) {
                                    return true;
                                }
                            } else if (m7Var.f111790f == null) {
                                list5 = this.f111791g;
                                list6 = m7Var.f111791g;
                                if (list5 != null) {
                                    if (list6 == null) {
                                        return false;
                                    }
                                    i11 = 0;
                                    while (r1.hasNext()) {
                                        i12 = i11 + 1;
                                        if (i11 < 0) {
                                            fr.h0.b0();
                                        }
                                        if (!((tp) obj5).b(list6.get(i11), expressionResolver, expressionResolver2)) {
                                            i11 = i12;
                                        }
                                    }
                                    return true;
                                }
                                if (list6 == null) {
                                    return true;
                                }
                            }
                        }
                    } else if (m7Var.f111788d == null) {
                        if (this.f111789e.evaluate(expressionResolver) == m7Var.f111789e.evaluate(expressionResolver2)) {
                            list4 = this.f111790f;
                            if (list4 != null) {
                                list7 = m7Var.f111790f;
                                if (list7 == null) {
                                    return false;
                                }
                                i13 = 0;
                                while (r1.hasNext()) {
                                    i14 = i13 + 1;
                                    if (i13 < 0) {
                                        fr.h0.b0();
                                    }
                                    if (!((mp) obj4).d(list7.get(i13), expressionResolver, expressionResolver2)) {
                                        i13 = i14;
                                    }
                                }
                                list5 = this.f111791g;
                                list6 = m7Var.f111791g;
                                if (list5 != null) {
                                    if (list6 == null) {
                                        return false;
                                    }
                                    i11 = 0;
                                    while (r1.hasNext()) {
                                        i12 = i11 + 1;
                                        if (i11 < 0) {
                                            fr.h0.b0();
                                        }
                                        if (!((tp) obj5).b(list6.get(i11), expressionResolver, expressionResolver2)) {
                                            i11 = i12;
                                        }
                                    }
                                    return true;
                                }
                                if (list6 == null) {
                                    return true;
                                }
                            } else if (m7Var.f111790f == null) {
                                list5 = this.f111791g;
                                list6 = m7Var.f111791g;
                                if (list5 != null) {
                                    if (list6 == null) {
                                        return false;
                                    }
                                    i11 = 0;
                                    while (r1.hasNext()) {
                                        i12 = i11 + 1;
                                        if (i11 < 0) {
                                            fr.h0.b0();
                                        }
                                        if (!((tp) obj5).b(list6.get(i11), expressionResolver, expressionResolver2)) {
                                            i11 = i12;
                                        }
                                    }
                                    return true;
                                }
                                if (list6 == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        int iHash3;
        Integer num = this.f111793i;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.m1.d(m7.class).hashCode();
        List<ca> list = this.f111785a;
        int iHash4 = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((ca) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int iHashCode2 = iHashCode + iHash + this.f111786b.hashCode();
        Iterator<T> it2 = this.f111787c.iterator();
        int iHash5 = 0;
        while (it2.hasNext()) {
            iHash5 += ((c) it2.next()).hash();
        }
        int i10 = iHashCode2 + iHash5;
        List<oo> list2 = this.f111788d;
        if (list2 != null) {
            Iterator<T> it3 = list2.iterator();
            iHash2 = 0;
            while (it3.hasNext()) {
                iHash2 += ((oo) it3.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int iHashCode3 = i10 + iHash2 + this.f111789e.hashCode();
        List<mp> list3 = this.f111790f;
        if (list3 != null) {
            Iterator<T> it4 = list3.iterator();
            iHash3 = 0;
            while (it4.hasNext()) {
                iHash3 += ((mp) it4.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i11 = iHashCode3 + iHash3;
        List<tp> list4 = this.f111791g;
        if (list4 != null) {
            Iterator<T> it5 = list4.iterator();
            while (it5.hasNext()) {
                iHash4 += ((tp) it5.next()).hash();
            }
        }
        int i12 = i11 + iHash4;
        this.f111793i = Integer.valueOf(i12);
        return i12;
    }

    @Override // com.yandex.div.data.Hashable
    public /* synthetic */ int propertiesHash() {
        return iq.c.a(this);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @oy.l
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().E2().getValue().b(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ m7(List list, String str, List list2, List list3, Expression expression, List list4, List list5, List list6, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? null : list, str, list2, (i10 & 8) != 0 ? null : list3, (i10 & 16) != 0 ? f111783k : expression, (i10 & 32) != 0 ? null : list4, (i10 & 64) != 0 ? null : list5, (i10 & 128) != 0 ? null : list6);
    }
}
