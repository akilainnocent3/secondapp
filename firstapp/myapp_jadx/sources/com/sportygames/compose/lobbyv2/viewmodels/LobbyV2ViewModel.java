package com.sportygames.compose.lobbyv2.viewmodels;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import com.sportygames.anTesting.data.model.CampaignParticipateV2;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.compose.lobbyv2.models.LobbyConfig;
import com.sportygames.compose.lobbyv2.models.LobbyV2AddFavouritesResponse;
import com.sportygames.compose.lobbyv2.models.LobbyV2CategoryItemModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeItemModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2ProviderGamesResponseModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2SearchResultsModel;
import com.sportygames.compose.lobbyv2.models.UIState;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import com.sportygames.lobby.remote.models.NotificationResponse;
import com.sportygames.lobby.remote.models.WalletInfo;
import defpackage.a52;
import defpackage.a8t;
import defpackage.b390;
import defpackage.brr;
import defpackage.c0d;
import defpackage.cha;
import defpackage.d390;
import defpackage.dct;
import defpackage.ej5;
import defpackage.fc80;
import defpackage.fnd;
import defpackage.fse;
import defpackage.g8t;
import defpackage.h0s;
import defpackage.hkd;
import defpackage.ib5;
import defpackage.ict;
import defpackage.ioz;
import defpackage.iqz;
import defpackage.j8i0;
import defpackage.joz;
import defpackage.kk;
import defpackage.kqz;
import defpackage.lyh;
import defpackage.m2g;
import defpackage.m6a0;
import defpackage.mbt;
import defpackage.o8i0;
import defpackage.odd;
import defpackage.pe4;
import defpackage.pfd;
import defpackage.q8t;
import defpackage.quw;
import defpackage.qxi0;
import defpackage.r8t;
import defpackage.rs5;
import defpackage.s75;
import defpackage.ssw;
import defpackage.sxi0;
import defpackage.t340;
import defpackage.ta6;
import defpackage.tbt;
import defpackage.tje0;
import defpackage.tom;
import defpackage.ubt;
import defpackage.uj50;
import defpackage.uwx;
import defpackage.uxi0;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vbt;
import defpackage.vje0;
import defpackage.wqz;
import defpackage.wwd0;
import defpackage.x1b;
import defpackage.xbp;
import defpackage.xqz;
import defpackage.xwd0;
import defpackage.y5b;
import defpackage.y7t;
import defpackage.ybt;
import defpackage.ymz;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/sportygames/compose/lobbyv2/viewmodels/LobbyV2ViewModel;", "Lj8i0;", "FavouriteRequest", "a", "e", "b", "d", "c", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LobbyV2ViewModel extends j8i0 {
    public final ssw<UIState<HTTPResponse<LobbyV2HomeModel>>> A;
    public final ssw<UIState<HTTPResponse<List<LobbyV2CategoryItemModel>>>> B;
    public ssw<UIState<HTTPResponse<LobbyV2SearchResultsModel>>> C;
    public final ssw<UIState<List<LobbyV2GameDetailsModel>>> D;
    public final LinkedHashMap E;
    public final LinkedHashMap F;
    public final LinkedHashMap G;
    public final LinkedHashMap H;
    public final m6a0<Integer, Boolean> I;
    public final m6a0<Integer, Boolean> J;
    public final ConcurrentHashMap<Integer, quw> K;
    public final ConcurrentHashMap<Integer, Boolean> L;
    public final ConcurrentHashMap<Integer, Boolean> M;
    public final ssw<Integer> N;
    public final wwd0 O;
    public final wwd0 P;
    public int Q;
    public CampaignParticipateV2 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public final ssw<Integer> V;
    public lyh<kqz<LobbyV2GameDetailsModel>> W;
    public t340 X;
    public final t340 Y;
    public List<Integer> Z;
    public final r8t a;
    public List<Integer> a0;
    public final uxi0 b;
    public t340 b0;
    public final kk c;
    public h0s<LobbyV2GameDetailsModel> c0;
    public final ssw<LoadingState<HTTPResponse<WalletInfo>>> d;
    public final LinkedHashMap d0;
    public final ssw<LoadingState<HTTPResponse<List<NotificationResponse>>>> e;
    public final LinkedHashMap e0;
    public final b390 f;
    public final LinkedHashMap f0;
    public final b390 i;
    public LobbyConfig v;
    public final ssw<UIState<HTTPResponse<LobbyV2AddFavouritesResponse>>> w;
    public final ssw<UIState<HTTPResponse<List<LobbyV2GameDetailsModel>>>> y;
    public final ssw<Integer> z;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u0003J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/sportygames/compose/lobbyv2/viewmodels/LobbyV2ViewModel$FavouriteRequest;", "Landroid/os/Parcelable;", "gameId", "", "<init>", "(I)V", "getGameId", "()I", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FavouriteRequest implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<FavouriteRequest> CREATOR = new a();
        private final int gameId;

        public static final class a implements Parcelable.Creator<FavouriteRequest> {
            @Override // android.os.Parcelable.Creator
            public final FavouriteRequest createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new FavouriteRequest(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final FavouriteRequest[] newArray(int i) {
                return new FavouriteRequest[i];
            }
        }

        public FavouriteRequest(@xbp(name = "gameId") int i) {
            this.gameId = i;
        }

        public static /* synthetic */ FavouriteRequest copy$default(FavouriteRequest favouriteRequest, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = favouriteRequest.gameId;
            }
            return favouriteRequest.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getGameId() {
            return this.gameId;
        }

        public final FavouriteRequest copy(@xbp(name = "gameId") int gameId) {
            return new FavouriteRequest(gameId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FavouriteRequest) && this.gameId == ((FavouriteRequest) other).gameId;
        }

        public final int getGameId() {
            return this.gameId;
        }

        public int hashCode() {
            return Integer.hashCode(this.gameId);
        }

        public String toString() {
            return pe4.b(this.gameId, "FavouriteRequest(gameId=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(this.gameId);
        }
    }

    public static final class a {
        /* JADX WARN: Code duplicated, block: B:22:0x0077  */
        public static void a(Context context, int i) {
            String userId;
            context.getClass();
            LinkedHashSet linkedHashSetB = b(context);
            if (linkedHashSetB.contains(Integer.valueOf(i))) {
                linkedHashSetB.remove(Integer.valueOf(i));
            }
            linkedHashSetB.add(Integer.valueOf(i));
            c(context);
            SharedPreferences sharedPreferences = context.getSharedPreferences("my_prefs", 0);
            sharedPreferences.getClass();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            StringBuilder sb = new StringBuilder();
            Iterator it = linkedHashSetB.iterator();
            while (it.hasNext()) {
                sb.append((Integer) it.next());
                sb.append(",");
            }
            String strSubstring = sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
            if (sportyGamesManager == null || (userId = sportyGamesManager.getUserId()) == null) {
                userId = "guest";
            } else {
                if (StringsKt.U(userId)) {
                    userId = null;
                }
                if (userId == null) {
                    userId = "guest";
                }
            }
            editorEdit.putString("ordered_unique_ints_".concat(userId), strSubstring);
            editorEdit.apply();
        }

        public static LinkedHashSet b(Context context) {
            Collection collectionT0;
            c(context);
            String string = context.getSharedPreferences("my_prefs", 0).getString(e(), "");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (string != null && string.length() != 0) {
                List listH = new Regex(",").h(string);
                if (listH.isEmpty()) {
                    collectionT0 = m2g.a;
                    break;
                }
                ListIterator listIterator = listH.listIterator(listH.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        collectionT0 = m2g.a;
                        break;
                    }
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionT0 = CollectionsKt.t0(listH, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                for (String str : (String[]) collectionT0.toArray(new String[0])) {
                    try {
                        linkedHashSet.add(Integer.valueOf(Integer.parseInt(str)));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return linkedHashSet;
        }

        public static void c(Context context) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("my_prefs", 0);
                String string = sharedPreferences.getString("ordered_unique_ints", null);
                if (string != null && string.length() != 0) {
                    String strE = e();
                    String string2 = sharedPreferences.getString(strE, null);
                    if (string2 != null && string2.length() != 0) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.remove("ordered_unique_ints");
                        editorEdit.apply();
                        return;
                    }
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    editorEdit2.putString(strE, string);
                    editorEdit2.remove("ordered_unique_ints");
                    editorEdit2.apply();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0045  */
        public static List d(List list) {
            boolean z;
            if (list == null || list.isEmpty()) {
                return m2g.a;
            }
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Integer launchRate = ((LobbyV2GameDetailsModel) list.get(i)).getLaunchRate();
                String strValueOf = String.valueOf(((LobbyV2GameDetailsModel) list.get(i)).getName());
                if (launchRate != null) {
                    try {
                        z = new brr().a(launchRate.intValue(), strValueOf);
                    } catch (NoSuchAlgorithmException e) {
                        e.printStackTrace();
                    }
                }
                if (launchRate != null && launchRate.intValue() > 0 && z) {
                    arrayList.add(list.get(i));
                }
            }
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0016  */
        public static String e() {
            String userId;
            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
            if (sportyGamesManager == null || (userId = sportyGamesManager.getUserId()) == null) {
                userId = "guest";
            } else {
                if (StringsKt.U(userId)) {
                    userId = null;
                }
                if (userId == null) {
                    userId = "guest";
                }
            }
            return "ordered_unique_ints_".concat(userId);
        }
    }

    public static final class b extends wqz<Integer, LobbyV2GameDetailsModel> {
        public final c b;
        public final r8t c;

        public b(c cVar, r8t r8tVar) {
            r8tVar.getClass();
            this.b = cVar;
            this.c = r8tVar;
        }

        @Override // defpackage.wqz
        public final Integer b(xqz<Integer, LobbyV2GameDetailsModel> xqzVar) {
            Integer num;
            Integer num2;
            Integer num3 = xqzVar.b;
            if (num3 == null) {
                return null;
            }
            int iIntValue = num3.intValue();
            wqz.b.c<Integer, LobbyV2GameDetailsModel> cVarA = xqzVar.a(iIntValue);
            if (cVarA != null && (num2 = cVarA.b) != null) {
                return Integer.valueOf(num2.intValue() + 1);
            }
            wqz.b.c<Integer, LobbyV2GameDetailsModel> cVarA2 = xqzVar.a(iIntValue);
            if (cVarA2 == null || (num = cVarA2.c) == null) {
                return null;
            }
            return Integer.valueOf(num.intValue() - 1);
        }

        /* JADX WARN: Code duplicated, block: B:106:0x0196 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:107:0x019c A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:109:0x01a0 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:111:0x01aa A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:121:0x01d8 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:127:0x01f2 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:130:0x0209 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:131:0x020e  */
        /* JADX WARN: Code duplicated, block: B:134:0x021d A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:135:0x0223 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:137:0x0227 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:139:0x0231 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:150:0x0260 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:152:0x0271 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:153:0x0276  */
        /* JADX WARN: Code duplicated, block: B:167:0x02b9 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:168:0x02bf A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:170:0x02c3 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:172:0x02cd A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:188:0x031f A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:190:0x0330 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:193:0x0345 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:194:0x034a  */
        /* JADX WARN: Code duplicated, block: B:197:0x0359 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:201:0x0366 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:205:0x0370  */
        /* JADX WARN: Code duplicated, block: B:208:0x0375 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:210:0x037d  */
        /* JADX WARN: Code duplicated, block: B:211:0x037e A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:214:0x0387 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:216:0x0391 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:218:0x0395 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:220:0x039f A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x0098 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x00b2 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x00c9 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:59:0x00dd A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x00e7 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x00eb A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x00f5 A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:89:0x013d A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:91:0x014e A[Catch: Exception -> 0x03ae, tom -> 0x03b5, IOException -> 0x03bc, TryCatch #2 {IOException -> 0x03bc, tom -> 0x03b5, Exception -> 0x03ae, blocks: (B:13:0x002d, B:119:0x01d2, B:121:0x01d8, B:123:0x01e9, B:128:0x01f8, B:130:0x0209, B:132:0x020f, B:199:0x0360, B:201:0x0366, B:204:0x036b, B:208:0x0375, B:212:0x0383, B:211:0x037e, B:214:0x0387, B:215:0x0390, B:134:0x021d, B:127:0x01f2, B:135:0x0223, B:137:0x0227, B:138:0x0230, B:139:0x0231, B:140:0x023f, B:16:0x0034, B:87:0x0137, B:89:0x013d, B:91:0x014e, B:94:0x0156, B:96:0x0167, B:98:0x016f, B:104:0x0184, B:106:0x0196, B:102:0x0178, B:103:0x017e, B:107:0x019c, B:109:0x01a0, B:110:0x01a9, B:111:0x01aa, B:112:0x01b8, B:19:0x003b, B:148:0x025a, B:150:0x0260, B:152:0x0271, B:155:0x0279, B:157:0x028a, B:159:0x0292, B:165:0x02a7, B:167:0x02b9, B:163:0x029b, B:164:0x02a1, B:168:0x02bf, B:170:0x02c3, B:171:0x02cc, B:172:0x02cd, B:173:0x02db, B:22:0x0042, B:185:0x0318, B:186:0x031b, B:188:0x031f, B:190:0x0330, B:191:0x0335, B:193:0x0345, B:195:0x034b, B:197:0x0359, B:216:0x0391, B:218:0x0395, B:219:0x039e, B:220:0x039f, B:221:0x03ad, B:25:0x0049, B:179:0x02f2, B:28:0x0050, B:44:0x0092, B:46:0x0098, B:48:0x00a9, B:53:0x00b8, B:55:0x00c9, B:57:0x00cf, B:59:0x00dd, B:52:0x00b2, B:61:0x00e7, B:63:0x00eb, B:64:0x00f4, B:65:0x00f5, B:66:0x0103, B:37:0x006a, B:40:0x007d, B:67:0x0104, B:69:0x0108, B:72:0x010e, B:74:0x0112, B:76:0x0116, B:79:0x011c, B:82:0x0122, B:83:0x0126, B:113:0x01b9, B:115:0x01bd, B:143:0x0245, B:144:0x0249, B:175:0x02de, B:181:0x02f6), top: B:229:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:92:0x0153  */
        @Override // defpackage.wqz
        public final Object d(wqz.a aVar, x1b x1bVar) {
            com.sportygames.compose.lobbyv2.viewmodels.a aVar2;
            int iIntValue;
            List<LobbyV2GameDetailsModel> arrayList;
            int i;
            int i2;
            int iIntValue2;
            ResultWrapper resultWrapper;
            LobbyV2HomeItemModel lobbyV2HomeItemModel;
            List<LobbyV2GameDetailsModel> arrayList2;
            LobbyV2HomeItemModel lobbyV2HomeItemModel2;
            int total;
            Integer bizCode;
            ResultWrapper resultWrapper2;
            List<LobbyV2GameDetailsModel> arrayList3;
            Integer total2;
            int iIntValue3;
            ResultWrapper resultWrapper3;
            List list;
            int size;
            Integer bizCode2;
            List list2;
            LobbyV2HomeItemModel lobbyV2HomeItemModel3;
            ResultWrapper resultWrapper4;
            List list3;
            int size2;
            Integer bizCode3;
            List list4;
            LobbyV2HomeItemModel lobbyV2HomeItemModel4;
            Integer numA;
            int i3;
            ResultWrapper resultWrapper5;
            LobbyV2ProviderGamesResponseModel lobbyV2ProviderGamesResponseModel;
            List<LobbyV2GameDetailsModel> arrayList4;
            LobbyV2ProviderGamesResponseModel lobbyV2ProviderGamesResponseModel2;
            Integer bizCode4;
            if (x1bVar instanceof com.sportygames.compose.lobbyv2.viewmodels.a) {
                aVar2 = (com.sportygames.compose.lobbyv2.viewmodels.a) x1bVar;
                int i4 = aVar2.d;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    aVar2.d = i4 - Integer.MIN_VALUE;
                } else {
                    aVar2 = new com.sportygames.compose.lobbyv2.viewmodels.a(this, x1bVar);
                }
            } else {
                aVar2 = new com.sportygames.compose.lobbyv2.viewmodels.a(this, x1bVar);
            }
            Object objD = aVar2.b;
            y5b y5bVar = y5b.a;
            Integer numA2 = null;
            int iIntValue4 = 0;
            try {
                switch (aVar2.d) {
                    case 0:
                        uj50.b(objD);
                        Integer num = (Integer) aVar.a();
                        iIntValue = num != null ? num.intValue() : 0;
                        int i5 = iIntValue == 0 ? 0 : iIntValue;
                        arrayList = new ArrayList<>();
                        c cVar = this.b;
                        d dVar = cVar.a;
                        List listH = cVar.c;
                        Integer num2 = cVar.b;
                        d dVar2 = d.b;
                        r8t r8tVar = this.c;
                        if (dVar == dVar2) {
                            Integer numA3 = s75.a(30);
                            aVar2.a = iIntValue;
                            aVar2.d = 1;
                            r8tVar.getClass();
                            objD = r8t.f(num2, i5, numA3, aVar2);
                            if (objD != y5bVar) {
                                i2 = iIntValue;
                                resultWrapper = (ResultWrapper) objD;
                                if (resultWrapper instanceof ResultWrapper.Success) {
                                    if (resultWrapper instanceof ResultWrapper.NetworkError) {
                                        throw new Exception(resultWrapper.toString());
                                    }
                                    resultWrapper.getClass();
                                    throw new Exception(((ResultWrapper.GenericError) resultWrapper).toString());
                                }
                                lobbyV2HomeItemModel = (LobbyV2HomeItemModel) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData();
                                if (lobbyV2HomeItemModel != null || (arrayList2 = lobbyV2HomeItemModel.getGameListVO()) == null) {
                                    arrayList2 = new ArrayList<>();
                                }
                                arrayList = arrayList2;
                                lobbyV2HomeItemModel2 = (LobbyV2HomeItemModel) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData();
                                if (lobbyV2HomeItemModel2 != null) {
                                    total = lobbyV2HomeItemModel2.getTotal();
                                } else {
                                    total = 0;
                                }
                                bizCode = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getBizCode();
                                if (bizCode != null) {
                                    iIntValue4 = bizCode.intValue();
                                }
                                int i6 = total;
                                iIntValue = i2;
                                iIntValue2 = iIntValue4;
                                iIntValue4 = i6;
                                if (!arrayList.isEmpty() || (i3 = iIntValue + 30) >= iIntValue4) {
                                    numA = null;
                                } else {
                                    numA = s75.a(i3);
                                }
                                if (iIntValue2 == 10000) {
                                    throw new Exception(String.valueOf(iIntValue2));
                                }
                                List listD = a.d(arrayList);
                                if (iIntValue == 0) {
                                    numA2 = s75.a(iIntValue - 30);
                                }
                                return new wqz.b.c(listD, numA2, numA);
                            }
                        } else {
                            d dVar3 = d.c;
                            if (dVar == dVar3 || dVar == d.a) {
                                if (dVar == dVar3) {
                                    Integer numA4 = s75.a(30);
                                    aVar2.a = iIntValue;
                                    aVar2.d = 2;
                                    r8tVar.getClass();
                                    objD = r8t.b(num2, i5, numA4, aVar2);
                                    if (objD != y5bVar) {
                                        i = iIntValue;
                                        resultWrapper2 = (ResultWrapper) objD;
                                        iIntValue = i;
                                        if (resultWrapper2 instanceof ResultWrapper.Success) {
                                            if (resultWrapper2 instanceof ResultWrapper.NetworkError) {
                                                throw new Exception(resultWrapper2.toString());
                                            }
                                            resultWrapper2.getClass();
                                            throw new Exception(((ResultWrapper.GenericError) resultWrapper2).toString());
                                        }
                                        arrayList3 = (List) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper2).getValue()).getData();
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList<>();
                                        }
                                        arrayList = arrayList3;
                                        total2 = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper2).getValue()).getTotal();
                                        if (total2 != null) {
                                            iIntValue3 = total2.intValue();
                                        } else {
                                            iIntValue3 = 0;
                                        }
                                        Integer bizCode5 = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper2).getValue()).getBizCode();
                                        iIntValue4 = iIntValue3;
                                        iIntValue2 = bizCode5 != null ? bizCode5.intValue() : 0;
                                        if (arrayList.isEmpty()) {
                                            numA = null;
                                        } else {
                                            numA = null;
                                        }
                                        if (iIntValue2 == 10000) {
                                            throw new Exception(String.valueOf(iIntValue2));
                                        }
                                        List listD2 = a.d(arrayList);
                                        if (iIntValue == 0) {
                                            numA2 = s75.a(iIntValue - 30);
                                        }
                                        return new wqz.b.c(listD2, numA2, numA);
                                    }
                                } else {
                                    Integer numA5 = s75.a(30);
                                    aVar2.a = iIntValue;
                                    aVar2.d = 3;
                                    r8tVar.getClass();
                                    pfd pfdVar = fse.a;
                                    objD = ej5.d(odd.b, new a52(new a8t(i5, numA5, null), null), aVar2);
                                    if (objD != y5bVar) {
                                        i = iIntValue;
                                        resultWrapper2 = (ResultWrapper) objD;
                                        iIntValue = i;
                                        if (resultWrapper2 instanceof ResultWrapper.Success) {
                                            if (resultWrapper2 instanceof ResultWrapper.NetworkError) {
                                                throw new Exception(resultWrapper2.toString());
                                            }
                                            resultWrapper2.getClass();
                                            throw new Exception(((ResultWrapper.GenericError) resultWrapper2).toString());
                                        }
                                        arrayList3 = (List) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper2).getValue()).getData();
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList<>();
                                        }
                                        arrayList = arrayList3;
                                        total2 = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper2).getValue()).getTotal();
                                        if (total2 != null) {
                                            iIntValue3 = total2.intValue();
                                        } else {
                                            iIntValue3 = 0;
                                        }
                                        Integer bizCode6 = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper2).getValue()).getBizCode();
                                        iIntValue4 = iIntValue3;
                                        iIntValue2 = bizCode6 != null ? bizCode6.intValue() : 0;
                                        if (arrayList.isEmpty()) {
                                            numA = null;
                                        } else {
                                            numA = null;
                                        }
                                        if (iIntValue2 == 10000) {
                                            throw new Exception(String.valueOf(iIntValue2));
                                        }
                                        List listD3 = a.d(arrayList);
                                        if (iIntValue == 0) {
                                            numA2 = s75.a(iIntValue - 30);
                                        }
                                        return new wqz.b.c(listD3, numA2, numA);
                                    }
                                }
                            } else if (dVar == d.d || dVar == d.f || dVar == d.i) {
                                if (listH == null) {
                                    listH = kotlin.collections.b.h();
                                }
                                aVar2.a = iIntValue;
                                aVar2.d = 4;
                                r8tVar.getClass();
                                objD = r8t.a(listH, aVar2);
                                if (objD != y5bVar) {
                                    i2 = iIntValue;
                                    resultWrapper3 = (ResultWrapper) objD;
                                    if (resultWrapper3 instanceof ResultWrapper.Success) {
                                        if (resultWrapper3 instanceof ResultWrapper.NetworkError) {
                                            throw new Exception(resultWrapper3.toString());
                                        }
                                        resultWrapper3.getClass();
                                        throw new Exception(((ResultWrapper.GenericError) resultWrapper3).toString());
                                    }
                                    list = (List) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper3).getValue()).getData();
                                    if (list != null) {
                                        size = list.size();
                                    } else {
                                        size = 0;
                                    }
                                    if (size > 0 || (list2 = (List) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper3).getValue()).getData()) == null || (lobbyV2HomeItemModel3 = (LobbyV2HomeItemModel) list2.get(0)) == null || (arrayList = lobbyV2HomeItemModel3.getGameListVO()) == null) {
                                    }
                                    arrayList = arrayList;
                                    total = arrayList.size();
                                    bizCode2 = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper3).getValue()).getBizCode();
                                    if (bizCode2 != null) {
                                        iIntValue4 = bizCode2.intValue();
                                    }
                                    int i7 = total;
                                    iIntValue = i2;
                                    iIntValue2 = iIntValue4;
                                    iIntValue4 = i7;
                                    if (arrayList.isEmpty()) {
                                        numA = null;
                                    } else {
                                        numA = null;
                                    }
                                    if (iIntValue2 == 10000) {
                                        throw new Exception(String.valueOf(iIntValue2));
                                    }
                                    List listD4 = a.d(arrayList);
                                    if (iIntValue == 0) {
                                        numA2 = s75.a(iIntValue - 30);
                                    }
                                    return new wqz.b.c(listD4, numA2, numA);
                                }
                            } else {
                                if (dVar != d.e) {
                                    if (dVar == d.v) {
                                        Integer numA6 = s75.a(30);
                                        aVar2.a = iIntValue;
                                        aVar2.d = 6;
                                        r8tVar.getClass();
                                        objD = r8t.d(num2, i5, numA6, aVar2);
                                        if (objD != y5bVar) {
                                            i2 = iIntValue;
                                            resultWrapper5 = (ResultWrapper) objD;
                                            if (resultWrapper5 instanceof ResultWrapper.Success) {
                                                if (resultWrapper5 instanceof ResultWrapper.NetworkError) {
                                                    throw new Exception(resultWrapper5.toString());
                                                }
                                                resultWrapper5.getClass();
                                                throw new Exception(((ResultWrapper.GenericError) resultWrapper5).toString());
                                            }
                                            lobbyV2ProviderGamesResponseModel = (LobbyV2ProviderGamesResponseModel) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper5).getValue()).getData();
                                            if (lobbyV2ProviderGamesResponseModel != null || (arrayList4 = lobbyV2ProviderGamesResponseModel.getData()) == null) {
                                                arrayList4 = new ArrayList<>();
                                            }
                                            arrayList = arrayList4;
                                            lobbyV2ProviderGamesResponseModel2 = (LobbyV2ProviderGamesResponseModel) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper5).getValue()).getData();
                                            if (lobbyV2ProviderGamesResponseModel2 != null) {
                                                total = lobbyV2ProviderGamesResponseModel2.getTotal();
                                            } else {
                                                total = 0;
                                            }
                                            bizCode4 = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper5).getValue()).getBizCode();
                                            if (bizCode4 != null) {
                                                iIntValue4 = bizCode4.intValue();
                                            }
                                            int i8 = total;
                                            iIntValue = i2;
                                            iIntValue2 = iIntValue4;
                                            iIntValue4 = i8;
                                        }
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    if (arrayList.isEmpty()) {
                                        numA = null;
                                    } else {
                                        numA = null;
                                    }
                                    if (iIntValue2 == 10000) {
                                        throw new Exception(String.valueOf(iIntValue2));
                                    }
                                    List listD5 = a.d(arrayList);
                                    if (iIntValue == 0) {
                                        numA2 = s75.a(iIntValue - 30);
                                    }
                                    return new wqz.b.c(listD5, numA2, numA);
                                }
                                if (listH == null) {
                                    listH = kotlin.collections.b.h();
                                }
                                aVar2.a = iIntValue;
                                aVar2.d = 5;
                                r8tVar.getClass();
                                objD = r8t.a(listH, aVar2);
                                if (objD != y5bVar) {
                                    i2 = iIntValue;
                                    resultWrapper4 = (ResultWrapper) objD;
                                    if (resultWrapper4 instanceof ResultWrapper.Success) {
                                        if (resultWrapper4 instanceof ResultWrapper.NetworkError) {
                                            throw new Exception(resultWrapper4.toString());
                                        }
                                        resultWrapper4.getClass();
                                        throw new Exception(((ResultWrapper.GenericError) resultWrapper4).toString());
                                    }
                                    list3 = (List) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper4).getValue()).getData();
                                    if (list3 != null) {
                                        size2 = list3.size();
                                    } else {
                                        size2 = 0;
                                    }
                                    if (size2 > 0 || (list4 = (List) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper4).getValue()).getData()) == null || (lobbyV2HomeItemModel4 = (LobbyV2HomeItemModel) list4.get(0)) == null || (arrayList = lobbyV2HomeItemModel4.getGameListVO()) == null) {
                                    }
                                    arrayList = arrayList;
                                    total = arrayList.size();
                                    bizCode3 = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper4).getValue()).getBizCode();
                                    if (bizCode3 != null) {
                                        iIntValue4 = bizCode3.intValue();
                                    }
                                    int i9 = total;
                                    iIntValue = i2;
                                    iIntValue2 = iIntValue4;
                                    iIntValue4 = i9;
                                    if (arrayList.isEmpty()) {
                                        numA = null;
                                    } else {
                                        numA = null;
                                    }
                                    if (iIntValue2 == 10000) {
                                        throw new Exception(String.valueOf(iIntValue2));
                                    }
                                    List listD6 = a.d(arrayList);
                                    if (iIntValue == 0) {
                                        numA2 = s75.a(iIntValue - 30);
                                    }
                                    return new wqz.b.c(listD6, numA2, numA);
                                }
                            }
                        }
                        return y5bVar;
                    case 1:
                        i2 = aVar2.a;
                        uj50.b(objD);
                        resultWrapper = (ResultWrapper) objD;
                        if (resultWrapper instanceof ResultWrapper.Success) {
                            if (resultWrapper instanceof ResultWrapper.NetworkError) {
                                throw new Exception(resultWrapper.toString());
                            }
                            resultWrapper.getClass();
                            throw new Exception(((ResultWrapper.GenericError) resultWrapper).toString());
                        }
                        lobbyV2HomeItemModel = (LobbyV2HomeItemModel) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData();
                        if (lobbyV2HomeItemModel != null) {
                            arrayList2 = new ArrayList<>();
                        } else {
                            arrayList2 = new ArrayList<>();
                        }
                        arrayList = arrayList2;
                        lobbyV2HomeItemModel2 = (LobbyV2HomeItemModel) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData();
                        if (lobbyV2HomeItemModel2 != null) {
                            total = lobbyV2HomeItemModel2.getTotal();
                        } else {
                            total = 0;
                        }
                        bizCode = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getBizCode();
                        if (bizCode != null) {
                            iIntValue4 = bizCode.intValue();
                        }
                        int i10 = total;
                        iIntValue = i2;
                        iIntValue2 = iIntValue4;
                        iIntValue4 = i10;
                        if (arrayList.isEmpty()) {
                            numA = null;
                        } else {
                            numA = null;
                        }
                        if (iIntValue2 == 10000) {
                            throw new Exception(String.valueOf(iIntValue2));
                        }
                        List listD7 = a.d(arrayList);
                        if (iIntValue == 0) {
                            numA2 = s75.a(iIntValue - 30);
                        }
                        return new wqz.b.c(listD7, numA2, numA);
                    case 2:
                        i = aVar2.a;
                        uj50.b(objD);
                        resultWrapper2 = (ResultWrapper) objD;
                        iIntValue = i;
                        if (resultWrapper2 instanceof ResultWrapper.Success) {
                            if (resultWrapper2 instanceof ResultWrapper.NetworkError) {
                                throw new Exception(resultWrapper2.toString());
                            }
                            resultWrapper2.getClass();
                            throw new Exception(((ResultWrapper.GenericError) resultWrapper2).toString());
                        }
                        arrayList3 = (List) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper2).getValue()).getData();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<>();
                        }
                        arrayList = arrayList3;
                        total2 = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper2).getValue()).getTotal();
                        if (total2 != null) {
                            iIntValue3 = total2.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        Integer bizCode7 = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper2).getValue()).getBizCode();
                        iIntValue4 = iIntValue3;
                        iIntValue2 = bizCode7 != null ? bizCode7.intValue() : 0;
                        if (arrayList.isEmpty()) {
                            numA = null;
                        } else {
                            numA = null;
                        }
                        if (iIntValue2 == 10000) {
                            throw new Exception(String.valueOf(iIntValue2));
                        }
                        List listD8 = a.d(arrayList);
                        if (iIntValue == 0) {
                            numA2 = s75.a(iIntValue - 30);
                        }
                        return new wqz.b.c(listD8, numA2, numA);
                    case 3:
                        i = aVar2.a;
                        uj50.b(objD);
                        resultWrapper2 = (ResultWrapper) objD;
                        iIntValue = i;
                        if (resultWrapper2 instanceof ResultWrapper.Success) {
                            if (resultWrapper2 instanceof ResultWrapper.NetworkError) {
                                throw new Exception(resultWrapper2.toString());
                            }
                            resultWrapper2.getClass();
                            throw new Exception(((ResultWrapper.GenericError) resultWrapper2).toString());
                        }
                        arrayList3 = (List) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper2).getValue()).getData();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<>();
                        }
                        arrayList = arrayList3;
                        total2 = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper2).getValue()).getTotal();
                        if (total2 != null) {
                            iIntValue3 = total2.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        Integer bizCode8 = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper2).getValue()).getBizCode();
                        iIntValue4 = iIntValue3;
                        iIntValue2 = bizCode8 != null ? bizCode8.intValue() : 0;
                        if (arrayList.isEmpty()) {
                            numA = null;
                        } else {
                            numA = null;
                        }
                        if (iIntValue2 == 10000) {
                            throw new Exception(String.valueOf(iIntValue2));
                        }
                        List listD9 = a.d(arrayList);
                        if (iIntValue == 0) {
                            numA2 = s75.a(iIntValue - 30);
                        }
                        return new wqz.b.c(listD9, numA2, numA);
                    case 4:
                        i2 = aVar2.a;
                        uj50.b(objD);
                        resultWrapper3 = (ResultWrapper) objD;
                        if (resultWrapper3 instanceof ResultWrapper.Success) {
                            if (resultWrapper3 instanceof ResultWrapper.NetworkError) {
                                throw new Exception(resultWrapper3.toString());
                            }
                            resultWrapper3.getClass();
                            throw new Exception(((ResultWrapper.GenericError) resultWrapper3).toString());
                        }
                        list = (List) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper3).getValue()).getData();
                        if (list != null) {
                            size = list.size();
                        } else {
                            size = 0;
                        }
                        List<LobbyV2GameDetailsModel> arrayList5 = size > 0 ? new ArrayList<>() : new ArrayList<>();
                        arrayList = arrayList5;
                        total = arrayList.size();
                        bizCode2 = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper3).getValue()).getBizCode();
                        if (bizCode2 != null) {
                            iIntValue4 = bizCode2.intValue();
                        }
                        int i11 = total;
                        iIntValue = i2;
                        iIntValue2 = iIntValue4;
                        iIntValue4 = i11;
                        if (arrayList.isEmpty()) {
                            numA = null;
                        } else {
                            numA = null;
                        }
                        if (iIntValue2 == 10000) {
                            throw new Exception(String.valueOf(iIntValue2));
                        }
                        List listD10 = a.d(arrayList);
                        if (iIntValue == 0) {
                            numA2 = s75.a(iIntValue - 30);
                        }
                        return new wqz.b.c(listD10, numA2, numA);
                    case 5:
                        i2 = aVar2.a;
                        uj50.b(objD);
                        resultWrapper4 = (ResultWrapper) objD;
                        if (resultWrapper4 instanceof ResultWrapper.Success) {
                            if (resultWrapper4 instanceof ResultWrapper.NetworkError) {
                                throw new Exception(resultWrapper4.toString());
                            }
                            resultWrapper4.getClass();
                            throw new Exception(((ResultWrapper.GenericError) resultWrapper4).toString());
                        }
                        list3 = (List) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper4).getValue()).getData();
                        if (list3 != null) {
                            size2 = list3.size();
                        } else {
                            size2 = 0;
                        }
                        List<LobbyV2GameDetailsModel> arrayList6 = size2 > 0 ? new ArrayList<>() : new ArrayList<>();
                        arrayList = arrayList6;
                        total = arrayList.size();
                        bizCode3 = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper4).getValue()).getBizCode();
                        if (bizCode3 != null) {
                            iIntValue4 = bizCode3.intValue();
                        }
                        int i12 = total;
                        iIntValue = i2;
                        iIntValue2 = iIntValue4;
                        iIntValue4 = i12;
                        if (arrayList.isEmpty()) {
                            numA = null;
                        } else {
                            numA = null;
                        }
                        if (iIntValue2 == 10000) {
                            throw new Exception(String.valueOf(iIntValue2));
                        }
                        List listD11 = a.d(arrayList);
                        if (iIntValue == 0) {
                            numA2 = s75.a(iIntValue - 30);
                        }
                        return new wqz.b.c(listD11, numA2, numA);
                    case 6:
                        i2 = aVar2.a;
                        uj50.b(objD);
                        resultWrapper5 = (ResultWrapper) objD;
                        if (resultWrapper5 instanceof ResultWrapper.Success) {
                            if (resultWrapper5 instanceof ResultWrapper.NetworkError) {
                                throw new Exception(resultWrapper5.toString());
                            }
                            resultWrapper5.getClass();
                            throw new Exception(((ResultWrapper.GenericError) resultWrapper5).toString());
                        }
                        lobbyV2ProviderGamesResponseModel = (LobbyV2ProviderGamesResponseModel) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper5).getValue()).getData();
                        if (lobbyV2ProviderGamesResponseModel != null) {
                            arrayList4 = new ArrayList<>();
                        } else {
                            arrayList4 = new ArrayList<>();
                        }
                        arrayList = arrayList4;
                        lobbyV2ProviderGamesResponseModel2 = (LobbyV2ProviderGamesResponseModel) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper5).getValue()).getData();
                        if (lobbyV2ProviderGamesResponseModel2 != null) {
                            total = lobbyV2ProviderGamesResponseModel2.getTotal();
                        } else {
                            total = 0;
                        }
                        bizCode4 = ((HTTPResponse) ((ResultWrapper.Success) resultWrapper5).getValue()).getBizCode();
                        if (bizCode4 != null) {
                            iIntValue4 = bizCode4.intValue();
                        }
                        int i13 = total;
                        iIntValue = i2;
                        iIntValue2 = iIntValue4;
                        iIntValue4 = i13;
                        if (arrayList.isEmpty()) {
                            numA = null;
                        } else {
                            numA = null;
                        }
                        if (iIntValue2 == 10000) {
                            throw new Exception(String.valueOf(iIntValue2));
                        }
                        List listD12 = a.d(arrayList);
                        if (iIntValue == 0) {
                            numA2 = s75.a(iIntValue - 30);
                        }
                        return new wqz.b.c(listD12, numA2, numA);
                    default:
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (IOException e) {
                return new wqz.b.a(e);
            } catch (tom e2) {
                return new wqz.b.a(e2);
            } catch (Exception e3) {
                return new wqz.b.a(e3);
            }
        }
    }

    public static final class c {
        public final d a;
        public final Integer b;
        public final List<Integer> c;

        public c(d dVar, Integer num, List list, int i) {
            num = (i & 2) != 0 ? null : num;
            list = (i & 4) != 0 ? null : list;
            this.a = dVar;
            this.b = num;
            this.c = list;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;
        public static final d f;
        public static final d i;
        public static final d v;
        public static final /* synthetic */ d[] w;

        static {
            d dVar = new d("FAVOURITES", 0);
            a = dVar;
            d dVar2 = new d("SECTION", 1);
            b = dVar2;
            d dVar3 = new d("CATEGORY", 2);
            c = dVar3;
            d dVar4 = new d("RECOMMENDED", 3);
            d = dVar4;
            d dVar5 = new d("RECENTLY_PLAYED", 4);
            e = dVar5;
            d dVar6 = new d("TRENDING_PLAYERS", 5);
            f = dVar6;
            d dVar7 = new d("USER_CONTROLLED", 6);
            i = dVar7;
            d dVar8 = new d("PROVIDER", 7);
            v = dVar8;
            w = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) w.clone();
        }
    }

    public static final class e extends wqz<Integer, NotificationResponse> {
        public final uxi0 b;
        public final int c;
        public final int d;

        public e(uxi0 uxi0Var) {
            uxi0Var.getClass();
            this.b = uxi0Var;
            this.c = 25;
            this.d = 6;
        }

        @Override // defpackage.wqz
        public final Integer b(xqz<Integer, NotificationResponse> xqzVar) {
            Integer num;
            Integer num2;
            Integer num3 = xqzVar.b;
            if (num3 == null) {
                return null;
            }
            int iIntValue = num3.intValue();
            wqz.b.c<Integer, NotificationResponse> cVarA = xqzVar.a(iIntValue);
            if (cVarA != null && (num2 = cVarA.b) != null) {
                return Integer.valueOf(num2.intValue() + 1);
            }
            wqz.b.c<Integer, NotificationResponse> cVarA2 = xqzVar.a(iIntValue);
            if (cVarA2 == null || (num = cVarA2.c) == null) {
                return null;
            }
            return Integer.valueOf(num.intValue() - 1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.wqz
        public final Object d(wqz.a aVar, x1b x1bVar) {
            com.sportygames.compose.lobbyv2.viewmodels.b bVar;
            int iIntValue;
            if (x1bVar instanceof com.sportygames.compose.lobbyv2.viewmodels.b) {
                bVar = (com.sportygames.compose.lobbyv2.viewmodels.b) x1bVar;
                int i = bVar.d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    bVar.d = i - Integer.MIN_VALUE;
                } else {
                    bVar = new com.sportygames.compose.lobbyv2.viewmodels.b(this, x1bVar);
                }
            } else {
                bVar = new com.sportygames.compose.lobbyv2.viewmodels.b(this, x1bVar);
            }
            Object objD = bVar.b;
            y5b y5bVar = y5b.a;
            int i2 = bVar.d;
            int i3 = this.c;
            Integer num = null;
            try {
                if (i2 == 0) {
                    uj50.b(objD);
                    Integer num2 = (Integer) aVar.a();
                    iIntValue = num2 != null ? num2.intValue() : 0;
                    int i4 = iIntValue * i3;
                    uxi0 uxi0Var = this.b;
                    bVar.a = iIntValue;
                    bVar.d = 1;
                    uxi0Var.getClass();
                    pfd pfdVar = fse.a;
                    objD = ej5.d(odd.b, new a52(new qxi0(i3, i4, null), null), bVar);
                    if (objD == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iIntValue = bVar.a;
                    uj50.b(objD);
                }
                ResultWrapper resultWrapper = (ResultWrapper) objD;
                if (!(resultWrapper instanceof ResultWrapper.Success)) {
                    if (resultWrapper instanceof ResultWrapper.NetworkError) {
                        return new wqz.b.a(new Exception(resultWrapper.toString()));
                    }
                    if (resultWrapper instanceof ResultWrapper.GenericError) {
                        return new wqz.b.a(new Exception(((ResultWrapper.GenericError) resultWrapper).toString()));
                    }
                    throw new uwx();
                }
                List list = (List) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData();
                if (list == null) {
                    list = m2g.a;
                }
                List list2 = list;
                boolean z = list2.size() < i3;
                boolean z2 = iIntValue >= this.d - 1;
                Integer num3 = iIntValue == 0 ? null : new Integer(iIntValue - 1);
                if (!list2.isEmpty() && !z && !z2) {
                    num = new Integer(iIntValue + 1);
                }
                return new wqz.b.c(list2, num3, num, Integer.MIN_VALUE, Integer.MIN_VALUE);
            } catch (IOException e) {
                return new wqz.b.a(e);
            } catch (tom e2) {
                return new wqz.b.a(e2);
            } catch (Exception e3) {
                return new wqz.b.a(e3);
            }
        }
    }

    @c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$getCategoriesList$1", f = "LobbyV2ViewModel.kt", l = {428}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return LobbyV2ViewModel.this.new f(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            HTTPResponse<WalletInfo> data;
            LobbyV2ViewModel lobbyV2ViewModel = LobbyV2ViewModel.this;
            ssw<UIState<HTTPResponse<List<LobbyV2CategoryItemModel>>>> sswVar = lobbyV2ViewModel.B;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                r8t r8tVar = lobbyV2ViewModel.a;
                this.a = 1;
                r8tVar.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new g8t(1, null), null), this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ResultWrapper resultWrapper = (ResultWrapper) obj;
            if (resultWrapper instanceof ResultWrapper.Success) {
                ResultWrapper.Success success = (ResultWrapper.Success) resultWrapper;
                List list = (List) ((HTTPResponse) success.getValue()).getData();
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ict.a);
                    LoadingState<HTTPResponse<WalletInfo>> loadingStateD = lobbyV2ViewModel.d.d();
                    if (loadingStateD != null && (data = loadingStateD.getData()) != null && data.getData() != null) {
                        arrayList.add(ict.b);
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add((LobbyV2CategoryItemModel) it.next());
                    }
                    ((HTTPResponse) success.getValue()).setData(arrayList);
                }
                UIState.Companion companion = UIState.INSTANCE;
                Object value = success.getValue();
                companion.getClass();
                sswVar.j(UIState.Companion.c(value));
            } else {
                sswVar.j(UIState.Companion.a(UIState.INSTANCE));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$getGameByName$1", f = "LobbyV2ViewModel.kt", l = {1691, 1693, 1695, 1706, 1717}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, v1b<? super g> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return LobbyV2ViewModel.this.new g(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0073  */
        /* JADX WARN: Code duplicated, block: B:26:0x0090  */
        /* JADX WARN: Code duplicated, block: B:28:0x0094  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
        
            if (r2.emit(r9, r19) == r3) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
        
            if (r2.emit(r8, r19) == r3) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
        
            if (r2.emit(r7, r19) == r3) goto L33;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$getLobbyWallet$1", f = "LobbyV2ViewModel.kt", l = {533}, m = "invokeSuspend", v = 1)
    public static final class h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Map<String, String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Map<String, String> map, v1b<? super h> v1bVar) {
            super(2, v1bVar);
            this.c = map;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return LobbyV2ViewModel.this.new h(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            LobbyV2ViewModel lobbyV2ViewModel = LobbyV2ViewModel.this;
            ssw<LoadingState<HTTPResponse<WalletInfo>>> sswVar = lobbyV2ViewModel.d;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                uxi0 uxi0Var = lobbyV2ViewModel.b;
                this.a = 1;
                uxi0Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new sxi0(1, null), null), this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ResultWrapper resultWrapper = (ResultWrapper) obj;
            if (resultWrapper instanceof ResultWrapper.Success) {
                sswVar.j(new LoadingState<>(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, this.c));
            } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
                sswVar.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, this.c));
            } else {
                Status status = Status.FAILED;
                resultWrapper.getClass();
                sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, this.c));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$refreshFavourite$1", f = "LobbyV2ViewModel.kt", l = {970}, m = "invokeSuspend", v = 1)
    public static final class i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public i(v1b<? super i> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return LobbyV2ViewModel.this.new i(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(2000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            iqz iqzVar = new iqz(30, 10, true, 30, 0, 48);
            LobbyV2ViewModel lobbyV2ViewModel = LobbyV2ViewModel.this;
            lobbyV2ViewModel.W = rs5.a(new ymz(new joz(new cha(lobbyV2ViewModel, 3), null), iqzVar, null).e, o8i0.d(lobbyV2ViewModel));
            lobbyV2ViewModel.J1();
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$sendLobbyANTestGameConvertIfRequired$1", f = "LobbyV2ViewModel.kt", l = {1081}, m = "invokeSuspend", v = 1)
    public static final class j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ CampaignParticipateV2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(CampaignParticipateV2 campaignParticipateV2, v1b<? super j> v1bVar) {
            super(2, v1bVar);
            this.b = campaignParticipateV2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new j(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                fc80 fc80Var = (fc80) fnd.e.getValue();
                CampaignParticipateV2 campaignParticipateV2 = this.b;
                Integer num = new Integer(campaignParticipateV2.getCampaignId());
                Integer num2 = new Integer(campaignParticipateV2.getVariantId());
                this.a = 1;
                if (fc80Var.a.b(num, null, num2, null, "game_click", null, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$setFavourite$1", f = "LobbyV2ViewModel.kt", l = {595}, m = "invokeSuspend", v = 1)
    public static final class k extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i, v1b<? super k> v1bVar) {
            super(2, v1bVar);
            this.c = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return LobbyV2ViewModel.this.new k(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (LobbyV2ViewModel.this.M1(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public LobbyV2ViewModel() {
        r8t r8tVar = new r8t();
        uxi0 uxi0Var = new uxi0();
        kk kkVar = new kk();
        this.a = r8tVar;
        this.b = uxi0Var;
        this.c = kkVar;
        this.d = new ssw<>();
        this.e = new ssw<>();
        b390 b390VarB = d390.b(0, 0, null, 6);
        this.f = b390VarB;
        this.i = b390VarB;
        this.w = new ssw<>();
        this.y = new ssw<>();
        this.z = new ssw<>(999888999);
        this.A = new ssw<>();
        this.B = new ssw<>();
        this.C = new ssw<>();
        UIState.INSTANCE.getClass();
        this.D = new ssw<>(UIState.Companion.b());
        this.E = new LinkedHashMap();
        this.F = new LinkedHashMap();
        this.G = new LinkedHashMap();
        this.H = new LinkedHashMap();
        m6a0<Integer, Boolean> m6a0Var = new m6a0<>();
        this.I = m6a0Var;
        this.J = m6a0Var;
        this.K = new ConcurrentHashMap<>();
        this.L = new ConcurrentHashMap<>();
        this.M = new ConcurrentHashMap<>();
        this.N = new ssw<>();
        wwd0 wwd0VarA = xwd0.a(null);
        this.O = wwd0VarA;
        this.P = wwd0VarA;
        this.Q = -1;
        this.V = new ssw<>(0);
        this.W = rs5.a(new ymz(new joz(new Function0() { // from class: hbt
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new LobbyV2ViewModel.b(new LobbyV2ViewModel.c(LobbyV2ViewModel.d.a, null, null, 6), this.a.a);
            }
        }, null), new iqz(30, 10, true, 30, 0, 48), null).e, o8i0.d(this));
        this.X = rs5.a(new ymz(new joz(new Function0() { // from class: kbt
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LobbyV2ViewModel lobbyV2ViewModel = this.a;
                List<Integer> list = lobbyV2ViewModel.Z;
                list.getClass();
                return new LobbyV2ViewModel.b(new LobbyV2ViewModel.c(LobbyV2ViewModel.d.d, null, list, 2), lobbyV2ViewModel.a);
            }
        }, null), new iqz(30, 10, true, 30, 0, 48), null).e, o8i0.d(this));
        this.Y = rs5.a(new ymz(new joz(new Function0() { // from class: lbt
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new LobbyV2ViewModel.e(this.a.b);
            }
        }, null), new iqz(25, 3, false, 25, 0, 48), null).e, o8i0.d(this));
        m2g m2gVar = m2g.a;
        this.Z = m2gVar;
        this.a0 = m2gVar;
        this.b0 = rs5.a(new ymz(new joz(new ta6(this, 2), null), new iqz(30, 10, true, 30, 0, 48), null).e, o8i0.d(this));
        rs5.a(new ymz(new joz(new mbt(this, 0), null), new iqz(30, 10, true, 30, 0, 48), null).e, o8i0.d(this));
        this.d0 = new LinkedHashMap();
        this.e0 = new LinkedHashMap();
        this.f0 = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void G1(LobbyV2HomeModel lobbyV2HomeModel) {
        Integer launchRate;
        String strValueOf;
        boolean z;
        List<LobbyV2HomeItemModel> result;
        List<LobbyV2HomeItemModel> arrayList = (lobbyV2HomeModel == null || (result = lobbyV2HomeModel.getResult()) == null) ? null : new ArrayList<>(result);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                LobbyV2HomeItemModel lobbyV2HomeItemModel = arrayList.get(i2);
                List<LobbyV2GameDetailsModel> gameListVO = lobbyV2HomeItemModel.getGameListVO();
                if (gameListVO == null) {
                    gameListVO = new ArrayList<>();
                }
                ArrayList arrayList2 = new ArrayList();
                int size2 = gameListVO.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    try {
                        if (gameListVO.get(i3).getCategoryId() <= 0) {
                            launchRate = gameListVO.get(i3).getLaunchRate();
                            strValueOf = String.valueOf(gameListVO.get(i3).getName());
                            if (launchRate != null) {
                                try {
                                    z = new brr().a(launchRate.intValue(), strValueOf);
                                } catch (NoSuchAlgorithmException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            if (launchRate == null && launchRate.intValue() > 0 && z) {
                                arrayList2.add(gameListVO.get(i3));
                            }
                        } else {
                            Integer gameId$SGLibrary_sportybetRelease = gameListVO.get(i3).getGameId$SGLibrary_sportybetRelease();
                            if ((gameId$SGLibrary_sportybetRelease != null ? gameId$SGLibrary_sportybetRelease.intValue() : 0) <= 0) {
                                arrayList2.add(gameListVO.get(i3));
                            } else {
                                launchRate = gameListVO.get(i3).getLaunchRate();
                                strValueOf = String.valueOf(gameListVO.get(i3).getName());
                                if (launchRate != null) {
                                    if (new brr().a(launchRate.intValue(), strValueOf)) {
                                    }
                                }
                                if (launchRate == null) {
                                }
                            }
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    lobbyV2HomeItemModel.setGameListVO(arrayList2);
                }
                arrayList.set(i2, lobbyV2HomeItemModel);
            }
        }
        if (lobbyV2HomeModel != null) {
            lobbyV2HomeModel.setResult(arrayList);
        }
    }

    public final lyh A1(final int i2, int i3, int i4, androidx.compose.runtime.a aVar) {
        boolean z = true;
        final boolean z2 = (i4 & 2) == 0;
        aVar.N(1986630400);
        Integer numValueOf = Integer.valueOf(i2);
        LinkedHashMap linkedHashMap = this.E;
        Object objA = linkedHashMap.get(numValueOf);
        if (objA == null) {
            iqz iqzVar = new iqz(30, 10, true, 30, 0, 48);
            boolean z3 = (((i3 & 112) ^ 48) > 32 && aVar.b(z2)) || (i3 & 48) == 32;
            if ((((i3 & 14) ^ 6) <= 4 || !aVar.d(i2)) && (i3 & 6) != 4) {
                z = false;
            }
            boolean zA = z | z3 | aVar.A(this);
            Object objY = aVar.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function0() { // from class: ibt
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean z4 = z2;
                        int i5 = i2;
                        return new LobbyV2ViewModel.b(z4 ? new LobbyV2ViewModel.c(LobbyV2ViewModel.d.b, Integer.valueOf(i5), null, 4) : new LobbyV2ViewModel.c(LobbyV2ViewModel.d.c, Integer.valueOf(i5), null, 4), this.a);
                    }
                };
                aVar.r(objY);
            }
            Function0 function0 = (Function0) objY;
            function0.getClass();
            objA = rs5.a(new ymz(function0 instanceof vje0 ? new ioz(function0) : new joz(function0, null), iqzVar, null).e, o8i0.d(this));
            linkedHashMap.put(numValueOf, objA);
        }
        lyh lyhVar = (lyh) objA;
        aVar.H();
        return lyhVar;
    }

    public final void B1(String str) {
        ej5.c(o8i0.d(this), null, null, new g(str, null), 3);
    }

    public final void C1(Map<String, String> map) {
        ej5.c(o8i0.d(this), null, null, new h(map, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D1(Context context, HTTPResponse hTTPResponse, Function0 function0, x1b x1bVar) {
        ybt ybtVar;
        HTTPResponse hTTPResponse2;
        if (x1bVar instanceof ybt) {
            ybtVar = (ybt) x1bVar;
            int i2 = ybtVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybtVar.f = i2 - Integer.MIN_VALUE;
            } else {
                ybtVar = new ybt(this, x1bVar);
            }
        } else {
            ybtVar = new ybt(this, x1bVar);
        }
        Object objF1 = ybtVar.d;
        Object obj = y5b.a;
        int i3 = ybtVar.f;
        ssw<UIState<HTTPResponse<LobbyV2HomeModel>>> sswVar = this.A;
        try {
            if (i3 == 0) {
                uj50.b(objF1);
                Integer bizCode = hTTPResponse.getBizCode();
                if (bizCode == null || bizCode.intValue() != 10000) {
                    sswVar.j(UIState.Companion.a(UIState.INSTANCE));
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return Unit.a;
                }
                LobbyV2HomeModel lobbyV2HomeModel = (LobbyV2HomeModel) hTTPResponse.getData();
                G1(lobbyV2HomeModel);
                hTTPResponse.setData(lobbyV2HomeModel);
                LobbyV2HomeModel lobbyV2HomeModel2 = (LobbyV2HomeModel) hTTPResponse.getData();
                ybtVar.a = hTTPResponse;
                ybtVar.b = function0;
                ybtVar.c = hTTPResponse;
                ybtVar.f = 1;
                objF1 = F1(context, lobbyV2HomeModel2, ybtVar);
                if (objF1 == obj) {
                    return obj;
                }
                hTTPResponse2 = hTTPResponse;
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hTTPResponse = ybtVar.c;
                function0 = ybtVar.b;
                hTTPResponse2 = ybtVar.a;
                uj50.b(objF1);
            }
            hTTPResponse.setData(objF1);
            UIState.INSTANCE.getClass();
            sswVar.j(UIState.Companion.c(hTTPResponse2));
            if (function0 != null) {
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            sswVar.j(UIState.Companion.a(UIState.INSTANCE));
        } finally {
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (D1(r7, r9, r8, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E1(android.content.Context r7, kotlin.jvm.functions.Function0 r8, defpackage.x1b r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.zbt
            if (r0 == 0) goto L13
            r0 = r9
            zbt r0 = (defpackage.zbt) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            zbt r0 = new zbt
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.uj50.b(r9)
            goto L80
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L31:
            kotlin.jvm.functions.Function0 r8 = r0.b
            android.content.Context r7 = r0.a
            defpackage.uj50.b(r9)
            goto L65
        L39:
            defpackage.uj50.b(r9)
            r6.R = r5
            r9 = 0
            r6.S = r9
            r6.T = r9
            r6.U = r9
            r0.a = r7
            r0.b = r8
            r0.e = r4
            r8t r9 = r6.a
            r9.getClass()
            pfd r9 = defpackage.fse.a
            odd r9 = defpackage.odd.b
            d8t r2 = new d8t
            r2.<init>(r4, r5)
            a52 r4 = new a52
            r4.<init>(r2, r5)
            java.lang.Object r9 = defpackage.ej5.d(r9, r4, r0)
            if (r9 != r1) goto L65
            goto L7f
        L65:
            com.sportygames.commons.remote.model.ResultWrapper r9 = (com.sportygames.commons.remote.model.ResultWrapper) r9
            boolean r2 = r9 instanceof com.sportygames.commons.remote.model.ResultWrapper.Success
            if (r2 == 0) goto L83
            com.sportygames.commons.remote.model.ResultWrapper$Success r9 = (com.sportygames.commons.remote.model.ResultWrapper.Success) r9
            java.lang.Object r9 = r9.getValue()
            com.sportygames.commons.remote.model.HTTPResponse r9 = (com.sportygames.commons.remote.model.HTTPResponse) r9
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r6 = r6.D1(r7, r9, r8, r0)
            if (r6 != r1) goto L80
        L7f:
            return r1
        L80:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L83:
            com.sportygames.compose.lobbyv2.models.UIState$a r7 = com.sportygames.compose.lobbyv2.models.UIState.INSTANCE
            com.sportygames.compose.lobbyv2.models.UIState r7 = com.sportygames.compose.lobbyv2.models.UIState.Companion.a(r7)
            ssw<com.sportygames.compose.lobbyv2.models.UIState<com.sportygames.commons.remote.model.HTTPResponse<com.sportygames.compose.lobbyv2.models.LobbyV2HomeModel>>> r6 = r6.A
            r6.j(r7)
            if (r8 == 0) goto L93
            r8.invoke()
        L93:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel.E1(android.content.Context, kotlin.jvm.functions.Function0, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:140:0x037f  */
    /* JADX WARN: Code duplicated, block: B:144:0x039c A[Catch: Exception -> 0x04e5, TRY_LEAVE, TryCatch #7 {Exception -> 0x04e5, blocks: (B:142:0x038e, B:144:0x039c, B:154:0x03cd), top: B:312:0x038e }] */
    /* JADX WARN: Code duplicated, block: B:146:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:160:0x03eb A[Catch: Exception -> 0x04c0, TryCatch #1 {Exception -> 0x04c0, blocks: (B:158:0x03e5, B:160:0x03eb, B:162:0x03ef), top: B:300:0x03e5 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0443 A[Catch: Exception -> 0x045d, TryCatch #3 {Exception -> 0x045d, blocks: (B:169:0x043f, B:171:0x0443, B:173:0x0454, B:175:0x045a, B:179:0x0463, B:181:0x0469, B:186:0x0491, B:188:0x0496, B:190:0x04a6, B:192:0x04ab, B:182:0x046e, B:184:0x0481, B:185:0x048c, B:191:0x04a9), top: B:304:0x043f }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0454 A[Catch: Exception -> 0x045d, TryCatch #3 {Exception -> 0x045d, blocks: (B:169:0x043f, B:171:0x0443, B:173:0x0454, B:175:0x045a, B:179:0x0463, B:181:0x0469, B:186:0x0491, B:188:0x0496, B:190:0x04a6, B:192:0x04ab, B:182:0x046e, B:184:0x0481, B:185:0x048c, B:191:0x04a9), top: B:304:0x043f }] */
    /* JADX WARN: Code duplicated, block: B:175:0x045a A[Catch: Exception -> 0x045d, TryCatch #3 {Exception -> 0x045d, blocks: (B:169:0x043f, B:171:0x0443, B:173:0x0454, B:175:0x045a, B:179:0x0463, B:181:0x0469, B:186:0x0491, B:188:0x0496, B:190:0x04a6, B:192:0x04ab, B:182:0x046e, B:184:0x0481, B:185:0x048c, B:191:0x04a9), top: B:304:0x043f }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0469 A[Catch: Exception -> 0x045d, TryCatch #3 {Exception -> 0x045d, blocks: (B:169:0x043f, B:171:0x0443, B:173:0x0454, B:175:0x045a, B:179:0x0463, B:181:0x0469, B:186:0x0491, B:188:0x0496, B:190:0x04a6, B:192:0x04ab, B:182:0x046e, B:184:0x0481, B:185:0x048c, B:191:0x04a9), top: B:304:0x043f }] */
    /* JADX WARN: Code duplicated, block: B:182:0x046e A[Catch: Exception -> 0x045d, TryCatch #3 {Exception -> 0x045d, blocks: (B:169:0x043f, B:171:0x0443, B:173:0x0454, B:175:0x045a, B:179:0x0463, B:181:0x0469, B:186:0x0491, B:188:0x0496, B:190:0x04a6, B:192:0x04ab, B:182:0x046e, B:184:0x0481, B:185:0x048c, B:191:0x04a9), top: B:304:0x043f }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0481 A[Catch: Exception -> 0x045d, TryCatch #3 {Exception -> 0x045d, blocks: (B:169:0x043f, B:171:0x0443, B:173:0x0454, B:175:0x045a, B:179:0x0463, B:181:0x0469, B:186:0x0491, B:188:0x0496, B:190:0x04a6, B:192:0x04ab, B:182:0x046e, B:184:0x0481, B:185:0x048c, B:191:0x04a9), top: B:304:0x043f }] */
    /* JADX WARN: Code duplicated, block: B:185:0x048c A[Catch: Exception -> 0x045d, TryCatch #3 {Exception -> 0x045d, blocks: (B:169:0x043f, B:171:0x0443, B:173:0x0454, B:175:0x045a, B:179:0x0463, B:181:0x0469, B:186:0x0491, B:188:0x0496, B:190:0x04a6, B:192:0x04ab, B:182:0x046e, B:184:0x0481, B:185:0x048c, B:191:0x04a9), top: B:304:0x043f }] */
    /* JADX WARN: Code duplicated, block: B:187:0x0494  */
    /* JADX WARN: Code duplicated, block: B:190:0x04a6 A[Catch: Exception -> 0x045d, TryCatch #3 {Exception -> 0x045d, blocks: (B:169:0x043f, B:171:0x0443, B:173:0x0454, B:175:0x045a, B:179:0x0463, B:181:0x0469, B:186:0x0491, B:188:0x0496, B:190:0x04a6, B:192:0x04ab, B:182:0x046e, B:184:0x0481, B:185:0x048c, B:191:0x04a9), top: B:304:0x043f }] */
    /* JADX WARN: Code duplicated, block: B:191:0x04a9 A[Catch: Exception -> 0x045d, TryCatch #3 {Exception -> 0x045d, blocks: (B:169:0x043f, B:171:0x0443, B:173:0x0454, B:175:0x045a, B:179:0x0463, B:181:0x0469, B:186:0x0491, B:188:0x0496, B:190:0x04a6, B:192:0x04ab, B:182:0x046e, B:184:0x0481, B:185:0x048c, B:191:0x04a9), top: B:304:0x043f }] */
    /* JADX WARN: Code duplicated, block: B:312:0x038e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105 A[Catch: Exception -> 0x01e3, TRY_LEAVE, TryCatch #8 {Exception -> 0x01e3, blocks: (B:40:0x00f9, B:42:0x0105), top: B:314:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x013a  */
    /* JADX WARN: Code duplicated, block: B:48:0x014d A[Catch: Exception -> 0x00cc, TryCatch #4 {Exception -> 0x00cc, blocks: (B:46:0x0147, B:48:0x014d, B:50:0x015e, B:52:0x016f, B:55:0x0177, B:57:0x018d, B:58:0x0192, B:59:0x019b, B:61:0x01a1, B:63:0x01ae, B:65:0x01b4, B:68:0x01bc, B:69:0x01c0, B:71:0x01c6, B:72:0x01c9, B:73:0x01cc, B:26:0x00c7), top: B:306:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x015e A[Catch: Exception -> 0x00cc, TryCatch #4 {Exception -> 0x00cc, blocks: (B:46:0x0147, B:48:0x014d, B:50:0x015e, B:52:0x016f, B:55:0x0177, B:57:0x018d, B:58:0x0192, B:59:0x019b, B:61:0x01a1, B:63:0x01ae, B:65:0x01b4, B:68:0x01bc, B:69:0x01c0, B:71:0x01c6, B:72:0x01c9, B:73:0x01cc, B:26:0x00c7), top: B:306:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x016f A[Catch: Exception -> 0x00cc, TryCatch #4 {Exception -> 0x00cc, blocks: (B:46:0x0147, B:48:0x014d, B:50:0x015e, B:52:0x016f, B:55:0x0177, B:57:0x018d, B:58:0x0192, B:59:0x019b, B:61:0x01a1, B:63:0x01ae, B:65:0x01b4, B:68:0x01bc, B:69:0x01c0, B:71:0x01c6, B:72:0x01c9, B:73:0x01cc, B:26:0x00c7), top: B:306:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0174  */
    /* JADX WARN: Code duplicated, block: B:55:0x0177 A[Catch: Exception -> 0x00cc, TryCatch #4 {Exception -> 0x00cc, blocks: (B:46:0x0147, B:48:0x014d, B:50:0x015e, B:52:0x016f, B:55:0x0177, B:57:0x018d, B:58:0x0192, B:59:0x019b, B:61:0x01a1, B:63:0x01ae, B:65:0x01b4, B:68:0x01bc, B:69:0x01c0, B:71:0x01c6, B:72:0x01c9, B:73:0x01cc, B:26:0x00c7), top: B:306:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x018d A[Catch: Exception -> 0x00cc, TryCatch #4 {Exception -> 0x00cc, blocks: (B:46:0x0147, B:48:0x014d, B:50:0x015e, B:52:0x016f, B:55:0x0177, B:57:0x018d, B:58:0x0192, B:59:0x019b, B:61:0x01a1, B:63:0x01ae, B:65:0x01b4, B:68:0x01bc, B:69:0x01c0, B:71:0x01c6, B:72:0x01c9, B:73:0x01cc, B:26:0x00c7), top: B:306:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a1 A[Catch: Exception -> 0x00cc, TryCatch #4 {Exception -> 0x00cc, blocks: (B:46:0x0147, B:48:0x014d, B:50:0x015e, B:52:0x016f, B:55:0x0177, B:57:0x018d, B:58:0x0192, B:59:0x019b, B:61:0x01a1, B:63:0x01ae, B:65:0x01b4, B:68:0x01bc, B:69:0x01c0, B:71:0x01c6, B:72:0x01c9, B:73:0x01cc, B:26:0x00c7), top: B:306:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01b4 A[Catch: Exception -> 0x00cc, TryCatch #4 {Exception -> 0x00cc, blocks: (B:46:0x0147, B:48:0x014d, B:50:0x015e, B:52:0x016f, B:55:0x0177, B:57:0x018d, B:58:0x0192, B:59:0x019b, B:61:0x01a1, B:63:0x01ae, B:65:0x01b4, B:68:0x01bc, B:69:0x01c0, B:71:0x01c6, B:72:0x01c9, B:73:0x01cc, B:26:0x00c7), top: B:306:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c6 A[Catch: Exception -> 0x00cc, TryCatch #4 {Exception -> 0x00cc, blocks: (B:46:0x0147, B:48:0x014d, B:50:0x015e, B:52:0x016f, B:55:0x0177, B:57:0x018d, B:58:0x0192, B:59:0x019b, B:61:0x01a1, B:63:0x01ae, B:65:0x01b4, B:68:0x01bc, B:69:0x01c0, B:71:0x01c6, B:72:0x01c9, B:73:0x01cc, B:26:0x00c7), top: B:306:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01cc A[Catch: Exception -> 0x00cc, TRY_LEAVE, TryCatch #4 {Exception -> 0x00cc, blocks: (B:46:0x0147, B:48:0x014d, B:50:0x015e, B:52:0x016f, B:55:0x0177, B:57:0x018d, B:58:0x0192, B:59:0x019b, B:61:0x01a1, B:63:0x01ae, B:65:0x01b4, B:68:0x01bc, B:69:0x01c0, B:71:0x01c6, B:72:0x01c9, B:73:0x01cc, B:26:0x00c7), top: B:306:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fe  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:193:0x04b3 -> B:316:0x03df). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:201:0x04d0 -> B:294:0x06cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:224:0x0570 -> B:226:0x0573). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:293:0x06c9 -> B:239:0x05bf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object F1(android.content.Context r22, com.sportygames.compose.lobbyv2.models.LobbyV2HomeModel r23, defpackage.x1b r24) {
        /*
            Method dump skipped, instruction units count: 1758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel.F1(android.content.Context, com.sportygames.compose.lobbyv2.models.LobbyV2HomeModel, x1b):java.lang.Object");
    }

    public final t340 H1(final Context context) {
        context.getClass();
        return rs5.a(new ymz(new joz(new Function0() { // from class: obt
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Context context2 = context;
                context2.getClass();
                List listM0 = CollectionsKt.m0(CollectionsKt.A0(LobbyV2ViewModel.a.b(context2)));
                listM0.getClass();
                return new LobbyV2ViewModel.b(new LobbyV2ViewModel.c(LobbyV2ViewModel.d.e, null, listM0, 2), this.a);
            }
        }, null), new iqz(30, 10, true, 30, 0, 48), null).e, o8i0.d(this));
    }

    public final void I1() {
        ej5.c(o8i0.d(this), null, null, new i(null), 3);
    }

    public final void J1() {
        ssw<Integer> sswVar = this.V;
        Integer numD = sswVar.d();
        sswVar.j(Integer.valueOf((numD != null ? numD.intValue() : 0) + 1));
    }

    public final void K1() {
        CampaignParticipateV2 campaignParticipateV2 = this.R;
        if (campaignParticipateV2 == null || !this.S || this.T) {
            return;
        }
        this.T = true;
        ej5.c(o8i0.d(this), null, null, new j(campaignParticipateV2, null), 3);
    }

    public final void L1(int i2, Context context, boolean z) {
        Integer numValueOf = Integer.valueOf(i2);
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.M;
        if (!concurrentHashMap.containsKey(numValueOf)) {
            concurrentHashMap.put(Integer.valueOf(i2), Boolean.valueOf(!z));
        }
        this.L.put(Integer.valueOf(i2), Boolean.valueOf(z));
        N1(i2, z);
        ej5.c(o8i0.d(this), null, null, new k(i2, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a4 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:54:0x0109, B:56:0x0111, B:59:0x0122, B:35:0x0099, B:37:0x00a4, B:39:0x00b1, B:41:0x00c2, B:43:0x00c8, B:47:0x00d8, B:50:0x00ed, B:51:0x00f4, B:60:0x0130, B:63:0x0136, B:66:0x013c, B:21:0x0055), top: B:71:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:54:0x0109, B:56:0x0111, B:59:0x0122, B:35:0x0099, B:37:0x00a4, B:39:0x00b1, B:41:0x00c2, B:43:0x00c8, B:47:0x00d8, B:50:0x00ed, B:51:0x00f4, B:60:0x0130, B:63:0x0136, B:66:0x013c, B:21:0x0055), top: B:71:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:54:0x0109, B:56:0x0111, B:59:0x0122, B:35:0x0099, B:37:0x00a4, B:39:0x00b1, B:41:0x00c2, B:43:0x00c8, B:47:0x00d8, B:50:0x00ed, B:51:0x00f4, B:60:0x0130, B:63:0x0136, B:66:0x013c, B:21:0x0055), top: B:71:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8 A[Catch: all -> 0x0040, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:54:0x0109, B:56:0x0111, B:59:0x0122, B:35:0x0099, B:37:0x00a4, B:39:0x00b1, B:41:0x00c2, B:43:0x00c8, B:47:0x00d8, B:50:0x00ed, B:51:0x00f4, B:60:0x0130, B:63:0x0136, B:66:0x013c, B:21:0x0055), top: B:71:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:54:0x0109, B:56:0x0111, B:59:0x0122, B:35:0x0099, B:37:0x00a4, B:39:0x00b1, B:41:0x00c2, B:43:0x00c8, B:47:0x00d8, B:50:0x00ed, B:51:0x00f4, B:60:0x0130, B:63:0x0136, B:66:0x013c, B:21:0x0055), top: B:71:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0111 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:54:0x0109, B:56:0x0111, B:59:0x0122, B:35:0x0099, B:37:0x00a4, B:39:0x00b1, B:41:0x00c2, B:43:0x00c8, B:47:0x00d8, B:50:0x00ed, B:51:0x00f4, B:60:0x0130, B:63:0x0136, B:66:0x013c, B:21:0x0055), top: B:71:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0122 A[Catch: all -> 0x0040, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:54:0x0109, B:56:0x0111, B:59:0x0122, B:35:0x0099, B:37:0x00a4, B:39:0x00b1, B:41:0x00c2, B:43:0x00c8, B:47:0x00d8, B:50:0x00ed, B:51:0x00f4, B:60:0x0130, B:63:0x0136, B:66:0x013c, B:21:0x0055), top: B:71:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0130 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:54:0x0109, B:56:0x0111, B:59:0x0122, B:35:0x0099, B:37:0x00a4, B:39:0x00b1, B:41:0x00c2, B:43:0x00c8, B:47:0x00d8, B:50:0x00ed, B:51:0x00f4, B:60:0x0130, B:63:0x0136, B:66:0x013c, B:21:0x0055), top: B:71:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x013c A[Catch: all -> 0x0040, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:54:0x0109, B:56:0x0111, B:59:0x0122, B:35:0x0099, B:37:0x00a4, B:39:0x00b1, B:41:0x00c2, B:43:0x00c8, B:47:0x00d8, B:50:0x00ed, B:51:0x00f4, B:60:0x0130, B:63:0x0136, B:66:0x013c, B:21:0x0055), top: B:71:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0144: INVOKE (r11 I:quw), (r9 I:java.lang.Object) INTERFACE call: quw.f(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:325), block:B:69:0x0144 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0106 -> B:54:0x0109). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object M1(int r13, defpackage.x1b r14) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel.M1(int, x1b):java.lang.Object");
    }

    public final void N1(int i2, boolean z) {
        Integer numValueOf = Integer.valueOf(i2);
        m6a0<Integer, Boolean> m6a0Var = this.J;
        if (m6a0Var.containsKey(numValueOf) && Intrinsics.g(m6a0Var.get(Integer.valueOf(i2)), Boolean.valueOf(z))) {
            return;
        }
        this.I.put(Integer.valueOf(i2), Boolean.valueOf(z));
    }

    public final synchronized void O1(int i2) {
        if (i2 == this.Q) {
            return;
        }
        this.Q = i2;
        wwd0 wwd0Var = this.O;
        Integer numValueOf = Integer.valueOf(i2);
        wwd0Var.getClass();
        wwd0Var.k(null, numValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0089 -> B:43:0x011f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00be -> B:12:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object P1(com.sportygames.compose.lobbyv2.models.LobbyV2HomeModel r33, defpackage.x1b r34) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel.P1(com.sportygames.compose.lobbyv2.models.LobbyV2HomeModel, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x1(int i2, x1b x1bVar) {
        tbt tbtVar;
        if (x1bVar instanceof tbt) {
            tbtVar = (tbt) x1bVar;
            int i3 = tbtVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tbtVar.c = i3 - Integer.MIN_VALUE;
            } else {
                tbtVar = new tbt(this, x1bVar);
            }
        } else {
            tbtVar = new tbt(this, x1bVar);
        }
        Object objD = tbtVar.a;
        y5b y5bVar = y5b.a;
        int i4 = tbtVar.c;
        ssw<UIState<HTTPResponse<LobbyV2AddFavouritesResponse>>> sswVar = this.w;
        boolean z = true;
        if (i4 == 0) {
            uj50.b(objD);
            UIState.INSTANCE.getClass();
            sswVar.j(UIState.Companion.d());
            FavouriteRequest favouriteRequest = new FavouriteRequest(i2);
            tbtVar.c = 1;
            this.a.getClass();
            pfd pfdVar = fse.a;
            objD = ej5.d(odd.b, new a52(new y7t(favouriteRequest, null), null), tbtVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        ResultWrapper resultWrapper = (ResultWrapper) objD;
        if (resultWrapper instanceof ResultWrapper.Success) {
            UIState.Companion companion = UIState.INSTANCE;
            Object value = ((ResultWrapper.Success) resultWrapper).getValue();
            companion.getClass();
            sswVar.j(UIState.Companion.c(value));
            ej5.c(o8i0.d(this), null, null, new vbt(this, null), 3);
            I1();
        } else {
            sswVar.j(UIState.Companion.a(UIState.INSTANCE));
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y1(int i2, x1b x1bVar) {
        ubt ubtVar;
        lyh<kqz<LobbyV2GameDetailsModel>> lyhVar;
        if (x1bVar instanceof ubt) {
            ubtVar = (ubt) x1bVar;
            int i3 = ubtVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ubtVar.d = i3 - Integer.MIN_VALUE;
            } else {
                ubtVar = new ubt(this, x1bVar);
            }
        } else {
            ubtVar = new ubt(this, x1bVar);
        }
        Object obj = ubtVar.b;
        y5b y5bVar = y5b.a;
        int i4 = ubtVar.d;
        ssw<UIState<HTTPResponse<List<LobbyV2GameDetailsModel>>>> sswVar = this.y;
        boolean z = true;
        if (i4 == 0) {
            uj50.b(obj);
            this.W = new dct(this.W, i2);
            J1();
            lyh<kqz<LobbyV2GameDetailsModel>> lyhVar2 = this.W;
            UIState.INSTANCE.getClass();
            sswVar.j(UIState.Companion.d());
            FavouriteRequest favouriteRequest = new FavouriteRequest(i2);
            ubtVar.a = lyhVar2;
            ubtVar.d = 1;
            this.a.getClass();
            pfd pfdVar = fse.a;
            Object objD = ej5.d(odd.b, new a52(new q8t(favouriteRequest, null), null), ubtVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
            obj = objD;
            lyhVar = lyhVar2;
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lyhVar = ubtVar.a;
            uj50.b(obj);
        }
        ResultWrapper resultWrapper = (ResultWrapper) obj;
        if (resultWrapper instanceof ResultWrapper.Success) {
            UIState.Companion companion = UIState.INSTANCE;
            Object value = ((ResultWrapper.Success) resultWrapper).getValue();
            companion.getClass();
            sswVar.j(UIState.Companion.c(value));
            ej5.c(o8i0.d(this), null, null, new vbt(this, null), 3);
            I1();
        } else {
            sswVar.j(UIState.Companion.a(UIState.INSTANCE));
            lyhVar.getClass();
            this.W = lyhVar;
            J1();
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void z1() {
        ej5.c(o8i0.d(this), null, null, new f(null), 3);
    }
}
