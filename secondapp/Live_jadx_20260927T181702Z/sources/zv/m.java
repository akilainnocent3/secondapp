package zv;

import dr.f1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@g
public final class m extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final List<String> f162670b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@oy.l List<String> missingFields, @oy.m String str, @oy.m Throwable th2) {
        super(str, th2);
        kotlin.jvm.internal.m0.p(missingFields, "missingFields");
        this.f162670b = missingFields;
    }

    @oy.l
    public final List<String> d() {
        return this.f162670b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(@oy.l List<String> missingFields, @oy.l String serialName) {
        String str;
        kotlin.jvm.internal.m0.p(missingFields, "missingFields");
        kotlin.jvm.internal.m0.p(serialName, "serialName");
        if (missingFields.size() == 1) {
            str = "Field '" + missingFields.get(0) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(missingFields, str, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(@oy.l String missingField, @oy.l String serialName) {
        this(fr.g0.l(missingField), "Field '" + missingField + "' is required for type with serial name '" + serialName + "', but it was missing", null);
        kotlin.jvm.internal.m0.p(missingField, "missingField");
        kotlin.jvm.internal.m0.p(serialName, "serialName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @f1
    public m(@oy.l String missingField) {
        this(fr.g0.l(missingField), "Field '" + missingField + "' is required, but it was missing", null);
        kotlin.jvm.internal.m0.p(missingField, "missingField");
    }
}
