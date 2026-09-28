package com.sportygames.pingpong.remote.models;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.fwv;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.nl;
import defpackage.nrg0;
import defpackage.tx5;
import defpackage.u4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001:\u0001CB\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0019\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010!J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0011HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010.J²\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\u00172\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\fHÖ\u0001J\t\u0010B\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.¨\u0006D"}, d2 = {"Lcom/sportygames/pingpong/remote/models/FairnessResponse;", "", AnalyticsParam.EVENT_PARAM_ID, "", "serverSeeds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "clientSeeds", "", "Lcom/sportygames/pingpong/remote/models/FairnessResponse$ClientSeed;", "clientSeedCount", "", "generatedHash", "hex", "decimal", "houseCoefficient", "", "startTime", "houseCoefficientStr", "serverSeed", "clientSeed", "seedRandom", "", "<init>", "(JLjava/util/ArrayList;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()J", "getServerSeeds", "()Ljava/util/ArrayList;", "getClientSeeds", "()Ljava/util/List;", "getClientSeedCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGeneratedHash", "()Ljava/lang/String;", "getHex", "getDecimal", "getHouseCoefficient", "()D", "getStartTime", "getHouseCoefficientStr", "getServerSeed", "getClientSeed", "getSeedRandom", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(JLjava/util/ArrayList;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/sportygames/pingpong/remote/models/FairnessResponse;", "equals", "other", "hashCode", "toString", "ClientSeed", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FairnessResponse {
    public static final int $stable = 8;
    private final String clientSeed;
    private final Integer clientSeedCount;
    private final List<ClientSeed> clientSeeds;
    private final String decimal;
    private final String generatedHash;
    private final String hex;
    private final double houseCoefficient;
    private final String houseCoefficientStr;
    private final long id;
    private final Boolean seedRandom;
    private final String serverSeed;
    private final ArrayList<String> serverSeeds;
    private final String startTime;

    public /* synthetic */ FairnessResponse(long j, ArrayList arrayList, List list, Integer num, String str, String str2, String str3, double d, String str4, String str5, String str6, String str7, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, arrayList, list, (i & 8) != 0 ? 0 : num, str, str2, str3, d, str4, str5, (i & 1024) != 0 ? "" : str6, (i & 2048) != 0 ? "" : str7, (i & 4096) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getHouseCoefficientStr() {
        return this.houseCoefficientStr;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getServerSeed() {
        return this.serverSeed;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getClientSeed() {
        return this.clientSeed;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getSeedRandom() {
        return this.seedRandom;
    }

    public final ArrayList<String> component2() {
        return this.serverSeeds;
    }

    public final List<ClientSeed> component3() {
        return this.clientSeeds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getClientSeedCount() {
        return this.clientSeedCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGeneratedHash() {
        return this.generatedHash;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHex() {
        return this.hex;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDecimal() {
        return this.decimal;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    public final FairnessResponse copy(long id, ArrayList<String> serverSeeds, List<ClientSeed> clientSeeds, Integer clientSeedCount, String generatedHash, String hex, String decimal, double houseCoefficient, String startTime, String houseCoefficientStr, String serverSeed, String clientSeed, Boolean seedRandom) {
        serverSeeds.getClass();
        generatedHash.getClass();
        hex.getClass();
        decimal.getClass();
        houseCoefficientStr.getClass();
        return new FairnessResponse(id, serverSeeds, clientSeeds, clientSeedCount, generatedHash, hex, decimal, houseCoefficient, startTime, houseCoefficientStr, serverSeed, clientSeed, seedRandom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FairnessResponse)) {
            return false;
        }
        FairnessResponse fairnessResponse = (FairnessResponse) other;
        return this.id == fairnessResponse.id && Intrinsics.g(this.serverSeeds, fairnessResponse.serverSeeds) && Intrinsics.g(this.clientSeeds, fairnessResponse.clientSeeds) && Intrinsics.g(this.clientSeedCount, fairnessResponse.clientSeedCount) && Intrinsics.g(this.generatedHash, fairnessResponse.generatedHash) && Intrinsics.g(this.hex, fairnessResponse.hex) && Intrinsics.g(this.decimal, fairnessResponse.decimal) && Double.compare(this.houseCoefficient, fairnessResponse.houseCoefficient) == 0 && Intrinsics.g(this.startTime, fairnessResponse.startTime) && Intrinsics.g(this.houseCoefficientStr, fairnessResponse.houseCoefficientStr) && Intrinsics.g(this.serverSeed, fairnessResponse.serverSeed) && Intrinsics.g(this.clientSeed, fairnessResponse.clientSeed) && Intrinsics.g(this.seedRandom, fairnessResponse.seedRandom);
    }

    public final String getClientSeed() {
        return this.clientSeed;
    }

    public final Integer getClientSeedCount() {
        return this.clientSeedCount;
    }

    public final List<ClientSeed> getClientSeeds() {
        return this.clientSeeds;
    }

    public final String getDecimal() {
        return this.decimal;
    }

    public final String getGeneratedHash() {
        return this.generatedHash;
    }

    public final String getHex() {
        return this.hex;
    }

    public final double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    public final String getHouseCoefficientStr() {
        return this.houseCoefficientStr;
    }

    public final long getId() {
        return this.id;
    }

    public final Boolean getSeedRandom() {
        return this.seedRandom;
    }

    public final String getServerSeed() {
        return this.serverSeed;
    }

    public final ArrayList<String> getServerSeeds() {
        return this.serverSeeds;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int iA = nl.a(this.serverSeeds, Long.hashCode(this.id) * 31, 31);
        List<ClientSeed> list = this.clientSeeds;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.clientSeedCount;
        int iA2 = nrg0.a(gmf0.a(gmf0.a(gmf0.a((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.generatedHash), 31, this.hex), 31, this.decimal), 31, this.houseCoefficient);
        String str = this.startTime;
        int iA3 = gmf0.a((iA2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.houseCoefficientStr);
        String str2 = this.serverSeed;
        int iHashCode2 = (iA3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientSeed;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.seedRandom;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        long j = this.id;
        ArrayList<String> arrayList = this.serverSeeds;
        List<ClientSeed> list = this.clientSeeds;
        Integer num = this.clientSeedCount;
        String str = this.generatedHash;
        String str2 = this.hex;
        String str3 = this.decimal;
        double d = this.houseCoefficient;
        String str4 = this.startTime;
        String str5 = this.houseCoefficientStr;
        String str6 = this.serverSeed;
        String str7 = this.clientSeed;
        Boolean bool = this.seedRandom;
        StringBuilder sb = new StringBuilder("FairnessResponse(id=");
        sb.append(j);
        sb.append(", serverSeeds=");
        sb.append(arrayList);
        sb.append(", clientSeeds=");
        sb.append(list);
        sb.append(", clientSeedCount=");
        sb.append(num);
        hxa.c(sb, ", generatedHash=", str, ", hex=", str2);
        u4.a(sb, ", decimal=", str3, ", houseCoefficient=");
        fwv.a(d, ", startTime=", str4, sb);
        hxa.c(sb, ", houseCoefficientStr=", str5, ", serverSeed=", str6);
        sb.append(", clientSeed=");
        sb.append(str7);
        sb.append(", seedRandom=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/sportygames/pingpong/remote/models/FairnessResponse$ClientSeed;", "", "name", "", "clientSeed", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getClientSeed", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ClientSeed {
        public static final int $stable = 0;
        private final String clientSeed;
        private final String name;

        public /* synthetic */ ClientSeed(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "NA" : str, (i & 2) != 0 ? "NA" : str2);
        }

        public static /* synthetic */ ClientSeed copy$default(ClientSeed clientSeed, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clientSeed.name;
            }
            if ((i & 2) != 0) {
                str2 = clientSeed.clientSeed;
            }
            return clientSeed.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getClientSeed() {
            return this.clientSeed;
        }

        public final ClientSeed copy(String name, String clientSeed) {
            return new ClientSeed(name, clientSeed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClientSeed)) {
                return false;
            }
            ClientSeed clientSeed = (ClientSeed) other;
            return Intrinsics.g(this.name, clientSeed.name) && Intrinsics.g(this.clientSeed, clientSeed.clientSeed);
        }

        public final String getClientSeed() {
            return this.clientSeed;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.clientSeed;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return tx5.a("ClientSeed(name=", this.name, ", clientSeed=", this.clientSeed, ")");
        }

        public ClientSeed(String str, String str2) {
            this.name = str;
            this.clientSeed = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ClientSeed() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    public FairnessResponse(long j, ArrayList<String> arrayList, List<ClientSeed> list, Integer num, String str, String str2, String str3, double d, String str4, String str5, String str6, String str7, Boolean bool) {
        arrayList.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str5.getClass();
        this.id = j;
        this.serverSeeds = arrayList;
        this.clientSeeds = list;
        this.clientSeedCount = num;
        this.generatedHash = str;
        this.hex = str2;
        this.decimal = str3;
        this.houseCoefficient = d;
        this.startTime = str4;
        this.houseCoefficientStr = str5;
        this.serverSeed = str6;
        this.clientSeed = str7;
        this.seedRandom = bool;
    }
}
