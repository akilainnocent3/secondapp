package com.sportybet.feature.loyalty.impl.notifications.presentation.mission;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.android.gp.tz.R;
import defpackage.ai50;
import defpackage.bb40;
import defpackage.ewt;
import defpackage.f78;
import defpackage.f87;
import defpackage.gan;
import defpackage.m9n;
import defpackage.nvl;
import defpackage.op8;
import defpackage.qw90;
import defpackage.rlf;
import defpackage.wsv;
import defpackage.zn8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/notifications/presentation/mission/LoyaltyMissionBottomSheetActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "<init>", "()V", "MissionBottomSheetArgument", "a", "Lcom/sportybet/feature/loyalty/impl/notifications/presentation/mission/d;", "state", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LoyaltyMissionBottomSheetActivity extends nvl implements rlf, bb40 {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: loaded from: classes.dex */
    public static final class a {
        public static void a(MissionBottomSheetArgument missionBottomSheetArgument, Context context) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) LoyaltyMissionBottomSheetActivity.class);
            intent.putExtra("mission_argument", missionBottomSheetArgument);
            context.startActivity(intent);
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m9n m9nVarA = qw90.a(this);
        List listK = kotlin.collections.b.k(getCMSString(R.string.page_loyalty__popup_mission_invite_img, new Object[0]), getCMSString(R.string.page_loyalty__popup_mission_complete_img, new Object[0]));
        listK.getClass();
        Iterator it = CollectionsKt.A0(CollectionsKt.D0(listK)).iterator();
        while (it.hasNext()) {
            gan.d(m9nVarA, this, it.next(), true);
        }
        zn8.a(this, new op8(-272966103, new ewt(this), true));
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007Ê\u0001\u0002\b\tÊ\u0001\f\b\n\u0012\b\b\u000b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\b"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/notifications/presentation/mission/LoyaltyMissionBottomSheetActivity$MissionBottomSheetArgument;", "Landroid/os/Parcelable;", "<init>", "()V", "RegularMission", "GamesCarouselMission", "Lcom/sportybet/feature/loyalty/impl/notifications/presentation/mission/LoyaltyMissionBottomSheetActivity$MissionBottomSheetArgument$GamesCarouselMission;", "Lcom/sportybet/feature/loyalty/impl/notifications/presentation/mission/LoyaltyMissionBottomSheetActivity$MissionBottomSheetArgument$RegularMission;", "impl", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static abstract class MissionBottomSheetArgument implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/notifications/presentation/mission/LoyaltyMissionBottomSheetActivity$MissionBottomSheetArgument$GamesCarouselMission;", "Lcom/sportybet/feature/loyalty/impl/notifications/presentation/mission/LoyaltyMissionBottomSheetActivity$MissionBottomSheetArgument;", "b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class GamesCarouselMission extends MissionBottomSheetArgument {
            public static final Parcelable.Creator<GamesCarouselMission> CREATOR = new a();
            public final String a;
            public final List<Long> b;
            public final long c;
            public final b d;

            public static final class a implements Parcelable.Creator<GamesCarouselMission> {
                @Override // android.os.Parcelable.Creator
                public final GamesCarouselMission createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    String string = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int i2 = 0;
                    while (true) {
                        long j = parcel.readLong();
                        if (i2 == i) {
                            return new GamesCarouselMission(string, arrayList, j, b.valueOf(parcel.readString()));
                        }
                        arrayList.add(Long.valueOf(j));
                        i2++;
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final GamesCarouselMission[] newArray(int i) {
                    return new GamesCarouselMission[i];
                }
            }

            public enum b {
                REWARDS("rewards"),
                /* JADX INFO: Fake field, exist only in values array */
                REMINDER("reminder");

                public final String a;

                b(String str) {
                    this.a = str;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GamesCarouselMission(String str, List<Long> list, long j, b bVar) {
                super(0);
                str.getClass();
                list.getClass();
                bVar.getClass();
                this.a = str;
                this.b = list;
                this.c = j;
                this.d = bVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GamesCarouselMission)) {
                    return false;
                }
                GamesCarouselMission gamesCarouselMission = (GamesCarouselMission) obj;
                return Intrinsics.g(this.a, gamesCarouselMission.a) && Intrinsics.g(this.b, gamesCarouselMission.b) && this.c == gamesCarouselMission.c && this.d == gamesCarouselMission.d;
            }

            public final int hashCode() {
                return this.d.hashCode() + f87.a(ai50.a(this.a.hashCode() * 31, 31, this.b), this.c, 31);
            }

            public final String toString() {
                return "GamesCarouselMission(currency=" + this.a + ", gamesBizIdsList=" + this.b + ", amount=" + this.c + ", source=" + this.d + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.a);
                List<Long> list = this.b;
                parcel.writeInt(list.size());
                Iterator<Long> it = list.iterator();
                while (it.hasNext()) {
                    parcel.writeLong(it.next().longValue());
                }
                parcel.writeLong(this.c);
                parcel.writeString(this.d.name());
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/notifications/presentation/mission/LoyaltyMissionBottomSheetActivity$MissionBottomSheetArgument$RegularMission;", "Lcom/sportybet/feature/loyalty/impl/notifications/presentation/mission/LoyaltyMissionBottomSheetActivity$MissionBottomSheetArgument;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class RegularMission extends MissionBottomSheetArgument {
            public static final Parcelable.Creator<RegularMission> CREATOR = new a();
            public final wsv a;
            public final Integer b;

            public static final class a implements Parcelable.Creator<RegularMission> {
                @Override // android.os.Parcelable.Creator
                public final RegularMission createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new RegularMission(wsv.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final RegularMission[] newArray(int i) {
                    return new RegularMission[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RegularMission(wsv wsvVar, Integer num) {
                super(0);
                wsvVar.getClass();
                this.a = wsvVar;
                this.b = num;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RegularMission)) {
                    return false;
                }
                RegularMission regularMission = (RegularMission) obj;
                return this.a == regularMission.a && Intrinsics.g(this.b, regularMission.b);
            }

            public final int hashCode() {
                int iHashCode = this.a.hashCode() * 31;
                Integer num = this.b;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            public final String toString() {
                return "RegularMission(missionType=" + this.a + ", missionId=" + this.b + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.a.name());
                Integer num = this.b;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    f78.c(parcel, 1, num);
                }
            }
        }

        public /* synthetic */ MissionBottomSheetArgument(int i) {
            this();
        }

        private MissionBottomSheetArgument() {
        }
    }
}
