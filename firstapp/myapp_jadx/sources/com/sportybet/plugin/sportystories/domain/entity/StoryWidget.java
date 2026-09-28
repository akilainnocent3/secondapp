package com.sportybet.plugin.sportystories.domain.entity;

import defpackage.d830;
import defpackage.gmf0;
import defpackage.tvh;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/sportybet/plugin/sportystories/domain/entity/StoryWidget;", "", "", "sortOrder", "<init>", "(I)V", "I", "getSortOrder", "()I", "c", "d", "a", "b", "Lcom/sportybet/plugin/sportystories/domain/entity/StoryWidget$a;", "Lcom/sportybet/plugin/sportystories/domain/entity/StoryWidget$b;", "Lcom/sportybet/plugin/sportystories/domain/entity/StoryWidget$c;", "Lcom/sportybet/plugin/sportystories/domain/entity/StoryWidget$d;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class StoryWidget {
    public static final int $stable = 8;
    private final int sortOrder;

    public static final class a extends StoryWidget {
        public final String a;
        public final String b;
        public final float c;
        public final int d;

        public a(float f, int i, String str, String str2) {
            super(i, null);
            this.a = str;
            this.b = str2;
            this.c = f;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Float.compare(this.c, aVar.c) == 0 && this.d == aVar.d;
        }

        @Override // com.sportybet.plugin.sportystories.domain.entity.StoryWidget
        public final int getSortOrder() {
            return this.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + tvh.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("CtaButton(text=", this.a, ", link=", this.b, ", width=");
            sbA.append(this.c);
            sbA.append(", sortOrder=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class b extends StoryWidget {
        public final String a;
        public final int b;

        public b(String str, int i) {
            super(i, null);
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b;
        }

        @Override // com.sportybet.plugin.sportystories.domain.entity.StoryWidget
        public final int getSortOrder() {
            return this.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return d830.a(this.b, "FeaturedMatch(eventId=", this.a, ", sortOrder=", ")");
        }
    }

    public static final class c extends StoryWidget {
        public final String a;
        public final int b;

        public c(String str, int i) {
            super(i, null);
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b;
        }

        @Override // com.sportybet.plugin.sportystories.domain.entity.StoryWidget
        public final int getSortOrder() {
            return this.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return d830.a(this.b, "H1Text(text=", this.a, ", sortOrder=", ")");
        }
    }

    public static final class d extends StoryWidget {
        public final String a;
        public final int b;

        public d(String str, int i) {
            super(i, null);
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && this.b == dVar.b;
        }

        @Override // com.sportybet.plugin.sportystories.domain.entity.StoryWidget
        public final int getSortOrder() {
            return this.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return d830.a(this.b, "H2Text(text=", this.a, ", sortOrder=", ")");
        }
    }

    private StoryWidget(int i) {
        this.sortOrder = i;
    }

    public int getSortOrder() {
        return this.sortOrder;
    }

    public /* synthetic */ StoryWidget(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
