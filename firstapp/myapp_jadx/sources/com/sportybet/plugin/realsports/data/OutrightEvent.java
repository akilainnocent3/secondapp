package com.sportybet.plugin.realsports.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.tx5;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\f\b\"\u0012\b\b#\u0012\u0004\b\u0003\u0010\u0002¨\u0006!"}, d2 = {"Lcom/sportybet/plugin/realsports/data/OutrightEvent;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "productStatus", "estimateStartTime", "", "estimateStopTime", "sport", "Lcom/sportybet/plugin/realsports/data/OutrightEvent$Sport;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLcom/sportybet/plugin/realsports/data/OutrightEvent$Sport;)V", "getEventId", "()Ljava/lang/String;", "getProductStatus", "getEstimateStartTime", "()J", "getEstimateStopTime", "getSport", "()Lcom/sportybet/plugin/realsports/data/OutrightEvent$Sport;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Sport", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OutrightEvent {
    public static final int $stable = 0;
    private final long estimateStartTime;
    private final long estimateStopTime;
    private final String eventId;
    private final String productStatus;
    private final Sport sport;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sportybet/plugin/realsports/data/OutrightEvent$Sport;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", com.sporty.android.book.domain.entity.Category.CATEGORY_ID, "Lcom/sportybet/plugin/realsports/data/OutrightEvent$Sport$Category;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/plugin/realsports/data/OutrightEvent$Sport$Category;)V", "getId", "()Ljava/lang/String;", "getName", "getCategory", "()Lcom/sportybet/plugin/realsports/data/OutrightEvent$Sport$Category;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Category", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Sport {
        public static final int $stable = 0;
        private final Category category;
        private final String id;
        private final String name;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sportybet/plugin/realsports/data/OutrightEvent$Sport$Category;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "tournament", "Lcom/sportybet/plugin/realsports/data/OutrightEvent$Sport$Category$Tournament;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/plugin/realsports/data/OutrightEvent$Sport$Category$Tournament;)V", "getId", "()Ljava/lang/String;", "getName", "getTournament", "()Lcom/sportybet/plugin/realsports/data/OutrightEvent$Sport$Category$Tournament;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Tournament", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Category {
            public static final int $stable = 0;
            private final String id;
            private final String name;
            private final Tournament tournament;

            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/sportybet/plugin/realsports/data/OutrightEvent$Sport$Category$Tournament;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
            public static final /* data */ class Tournament {
                public static final int $stable = 0;
                private final String id;
                private final String name;

                public Tournament(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    this.id = str;
                    this.name = str2;
                }

                public static /* synthetic */ Tournament copy$default(Tournament tournament, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = tournament.id;
                    }
                    if ((i & 2) != 0) {
                        str2 = tournament.name;
                    }
                    return tournament.copy(str, str2);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                public final Tournament copy(String id, String name) {
                    id.getClass();
                    name.getClass();
                    return new Tournament(id, name);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Tournament)) {
                        return false;
                    }
                    Tournament tournament = (Tournament) other;
                    return Intrinsics.g(this.id, tournament.id) && Intrinsics.g(this.name, tournament.name);
                }

                public final String getId() {
                    return this.id;
                }

                public final String getName() {
                    return this.name;
                }

                public int hashCode() {
                    return this.name.hashCode() + (this.id.hashCode() * 31);
                }

                public String toString() {
                    return tx5.a("Tournament(id=", this.id, ", name=", this.name, ")");
                }
            }

            public Category(String str, String str2, Tournament tournament) {
                str.getClass();
                str2.getClass();
                tournament.getClass();
                this.id = str;
                this.name = str2;
                this.tournament = tournament;
            }

            public static /* synthetic */ Category copy$default(Category category, String str, String str2, Tournament tournament, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = category.id;
                }
                if ((i & 2) != 0) {
                    str2 = category.name;
                }
                if ((i & 4) != 0) {
                    tournament = category.tournament;
                }
                return category.copy(str, str2, tournament);
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
            public final Tournament getTournament() {
                return this.tournament;
            }

            public final Category copy(String id, String name, Tournament tournament) {
                id.getClass();
                name.getClass();
                tournament.getClass();
                return new Category(id, name, tournament);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Category)) {
                    return false;
                }
                Category category = (Category) other;
                return Intrinsics.g(this.id, category.id) && Intrinsics.g(this.name, category.name) && Intrinsics.g(this.tournament, category.tournament);
            }

            public final String getId() {
                return this.id;
            }

            public final String getName() {
                return this.name;
            }

            public final Tournament getTournament() {
                return this.tournament;
            }

            public int hashCode() {
                return this.tournament.hashCode() + gmf0.a(this.id.hashCode() * 31, 31, this.name);
            }

            public String toString() {
                String str = this.id;
                String str2 = this.name;
                Tournament tournament = this.tournament;
                StringBuilder sbA = ux5.a("Category(id=", str, ", name=", str2, ", tournament=");
                sbA.append(tournament);
                sbA.append(")");
                return sbA.toString();
            }
        }

        public Sport(String str, String str2, Category category) {
            str.getClass();
            str2.getClass();
            category.getClass();
            this.id = str;
            this.name = str2;
            this.category = category;
        }

        public static /* synthetic */ Sport copy$default(Sport sport, String str, String str2, Category category, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sport.id;
            }
            if ((i & 2) != 0) {
                str2 = sport.name;
            }
            if ((i & 4) != 0) {
                category = sport.category;
            }
            return sport.copy(str, str2, category);
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
        public final Category getCategory() {
            return this.category;
        }

        public final Sport copy(String id, String name, Category category) {
            id.getClass();
            name.getClass();
            category.getClass();
            return new Sport(id, name, category);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sport)) {
                return false;
            }
            Sport sport = (Sport) other;
            return Intrinsics.g(this.id, sport.id) && Intrinsics.g(this.name, sport.name) && Intrinsics.g(this.category, sport.category);
        }

        public final Category getCategory() {
            return this.category;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.category.hashCode() + gmf0.a(this.id.hashCode() * 31, 31, this.name);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.name;
            Category category = this.category;
            StringBuilder sbA = ux5.a("Sport(id=", str, ", name=", str2, ", category=");
            sbA.append(category);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public OutrightEvent(String str, String str2, long j, long j2, Sport sport) {
        str.getClass();
        str2.getClass();
        sport.getClass();
        this.eventId = str;
        this.productStatus = str2;
        this.estimateStartTime = j;
        this.estimateStopTime = j2;
        this.sport = sport;
    }

    public static /* synthetic */ OutrightEvent copy$default(OutrightEvent outrightEvent, String str, String str2, long j, long j2, Sport sport, int i, Object obj) {
        if ((i & 1) != 0) {
            str = outrightEvent.eventId;
        }
        if ((i & 2) != 0) {
            str2 = outrightEvent.productStatus;
        }
        if ((i & 4) != 0) {
            j = outrightEvent.estimateStartTime;
        }
        if ((i & 8) != 0) {
            j2 = outrightEvent.estimateStopTime;
        }
        if ((i & 16) != 0) {
            sport = outrightEvent.sport;
        }
        Sport sport2 = sport;
        long j3 = j2;
        return outrightEvent.copy(str, str2, j, j3, sport2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProductStatus() {
        return this.productStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEstimateStartTime() {
        return this.estimateStartTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEstimateStopTime() {
        return this.estimateStopTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Sport getSport() {
        return this.sport;
    }

    public final OutrightEvent copy(String eventId, String productStatus, long estimateStartTime, long estimateStopTime, Sport sport) {
        eventId.getClass();
        productStatus.getClass();
        sport.getClass();
        return new OutrightEvent(eventId, productStatus, estimateStartTime, estimateStopTime, sport);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutrightEvent)) {
            return false;
        }
        OutrightEvent outrightEvent = (OutrightEvent) other;
        return Intrinsics.g(this.eventId, outrightEvent.eventId) && Intrinsics.g(this.productStatus, outrightEvent.productStatus) && this.estimateStartTime == outrightEvent.estimateStartTime && this.estimateStopTime == outrightEvent.estimateStopTime && Intrinsics.g(this.sport, outrightEvent.sport);
    }

    public final long getEstimateStartTime() {
        return this.estimateStartTime;
    }

    public final long getEstimateStopTime() {
        return this.estimateStopTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getProductStatus() {
        return this.productStatus;
    }

    public final Sport getSport() {
        return this.sport;
    }

    public int hashCode() {
        return this.sport.hashCode() + f87.a(f87.a(gmf0.a(this.eventId.hashCode() * 31, 31, this.productStatus), this.estimateStartTime, 31), this.estimateStopTime, 31);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.productStatus;
        long j = this.estimateStartTime;
        long j2 = this.estimateStopTime;
        Sport sport = this.sport;
        StringBuilder sbA = ux5.a("OutrightEvent(eventId=", str, ", productStatus=", str2, ", estimateStartTime=");
        sbA.append(j);
        g41.a(j2, ", estimateStopTime=", ", sport=", sbA);
        sbA.append(sport);
        sbA.append(")");
        return sbA.toString();
    }
}
