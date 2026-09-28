package com.sporty.android.book.domain.entity;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.at6;
import defpackage.bt6;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.ux5;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015Ê\u0001\f\b\"\u0012\b\b#\u0012\u0004\b\u0003\u0010\u0000¨\u0006!"}, d2 = {"Lcom/sporty/android/book/domain/entity/Sport;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "eventSize", "", "categories", "", "Lcom/sporty/android/book/domain/entity/Category;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getId", "()Ljava/lang/String;", "getName", "getEventSize", "()I", "getCategories", "()Ljava/util/List;", "topCategory", "getTopCategory", "()Lcom/sporty/android/book/domain/entity/Category;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Sport {
    private final List<Category> categories;
    private final int eventSize;
    private final String id;
    private final String name;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/book/domain/entity/Sport$Companion;", "", "<init>", "()V", "mock", "Lcom/sporty/android/book/domain/entity/Sport;", AnalyticsParam.EVENT_PARAM_ID, "", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Sport mock(String id) {
            id.getClass();
            Category.Companion companion = Category.INSTANCE;
            return new Sport(id, "Football", 10, b.k(companion.mock("sr:category:top"), companion.mock("1"), companion.mock("2")));
        }

        private Companion() {
        }
    }

    public Sport(String str, String str2, int i, List<Category> list) {
        bt6.a(str, str2, list);
        this.id = str;
        this.name = str2;
        this.eventSize = i;
        this.categories = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Sport copy$default(Sport sport, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sport.id;
        }
        if ((i2 & 2) != 0) {
            str2 = sport.name;
        }
        if ((i2 & 4) != 0) {
            i = sport.eventSize;
        }
        if ((i2 & 8) != 0) {
            list = sport.categories;
        }
        return sport.copy(str, str2, i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEventSize() {
        return this.eventSize;
    }

    public final List<Category> component4() {
        return this.categories;
    }

    public final Sport copy(String id, String name, int eventSize, List<Category> categories) {
        id.getClass();
        name.getClass();
        categories.getClass();
        return new Sport(id, name, eventSize, categories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sport)) {
            return false;
        }
        Sport sport = (Sport) other;
        return Intrinsics.g(this.id, sport.id) && Intrinsics.g(this.name, sport.name) && this.eventSize == sport.eventSize && Intrinsics.g(this.categories, sport.categories);
    }

    public final List<Category> getCategories() {
        return this.categories;
    }

    public final int getEventSize() {
        return this.eventSize;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final Category getTopCategory() {
        Object next;
        Iterator<T> it = this.categories.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (c.l(((Category) next).getId(), "sr:category:top", true)) {
                return (Category) next;
            }
        }
        next = null;
        return (Category) next;
    }

    public int hashCode() {
        return this.categories.hashCode() + gpp.a(this.eventSize, gmf0.a(this.id.hashCode() * 31, 31, this.name), 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        return at6.b(ux5.a("Sport(id=", str, ", name=", str2, ", eventSize="), this.eventSize, ", categories=", this.categories, ")");
    }
}
