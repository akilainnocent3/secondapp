package com.sporty.android.book.domain.entity;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.at6;
import defpackage.bt6;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000¨\u0006 "}, d2 = {"Lcom/sporty/android/book/domain/entity/Category;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "eventSize", "", "tournaments", "", "Lcom/sporty/android/book/domain/entity/Tournament;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getId", "()Ljava/lang/String;", "getName", "getEventSize", "()I", "getTournaments", "()Ljava/util/List;", "isFavourites", "", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Companion", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Category {
    public static final String CATEGORY_ID = "category";
    public static final String FAVOURITES_ID = "favourites";
    private final int eventSize;
    private final String id;
    private final String name;
    private final List<Tournament> tournaments;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/sporty/android/book/domain/entity/Category$Companion;", "", "<init>", "()V", "FAVOURITES_ID", "", "CATEGORY_ID", "mock", "Lcom/sporty/android/book/domain/entity/Category;", AnalyticsParam.EVENT_PARAM_ID, "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Category mock(String id) {
            id.getClass();
            Tournament.Companion companion = Tournament.INSTANCE;
            return new Category(id, "Turkiye", 20, b.k(companion.mock("1"), companion.mock("2"), companion.mock("3"), companion.mock("4"), companion.mock("5"), companion.mock("6"), companion.mock("7"), companion.mock("8")));
        }

        private Companion() {
        }
    }

    public Category(String str, String str2, int i, List<Tournament> list) {
        bt6.a(str, str2, list);
        this.id = str;
        this.name = str2;
        this.eventSize = i;
        this.tournaments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Category copy$default(Category category, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = category.id;
        }
        if ((i2 & 2) != 0) {
            str2 = category.name;
        }
        if ((i2 & 4) != 0) {
            i = category.eventSize;
        }
        if ((i2 & 8) != 0) {
            list = category.tournaments;
        }
        return category.copy(str, str2, i, list);
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

    public final List<Tournament> component4() {
        return this.tournaments;
    }

    public final Category copy(String id, String name, int eventSize, List<Tournament> tournaments) {
        id.getClass();
        name.getClass();
        tournaments.getClass();
        return new Category(id, name, eventSize, tournaments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Category)) {
            return false;
        }
        Category category = (Category) other;
        return Intrinsics.g(this.id, category.id) && Intrinsics.g(this.name, category.name) && this.eventSize == category.eventSize && Intrinsics.g(this.tournaments, category.tournaments);
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

    public final List<Tournament> getTournaments() {
        return this.tournaments;
    }

    public int hashCode() {
        return this.tournaments.hashCode() + gpp.a(this.eventSize, gmf0.a(this.id.hashCode() * 31, 31, this.name), 31);
    }

    public final boolean isFavourites() {
        return Intrinsics.g(this.id, FAVOURITES_ID);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        return at6.b(ux5.a("Category(id=", str, ", name=", str2, ", eventSize="), this.eventSize, ", tournaments=", this.tournaments, ")");
    }
}
