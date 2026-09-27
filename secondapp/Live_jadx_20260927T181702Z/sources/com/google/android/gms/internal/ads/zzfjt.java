package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfjt {

    @Nullable
    public final zzccy zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final int zzQ;
    public final int zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final String zzU;
    public final zzfkp zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final List zzaA;
    public final boolean zzaB;
    public final List zzaC;
    public final boolean zzaD;
    public final int zzaE;
    public final Bundle zzaF;
    public final boolean zzaG;
    public final int zzaH;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;

    @Nullable
    public final zzbyv zzad;

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzt zzae;
    public final String zzaf;
    public final boolean zzag;
    public final JSONObject zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;

    @Nullable
    public final String zzal;
    public final boolean zzam;
    public final String zzan;
    public final String zzao;
    public final String zzap;
    public final boolean zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final boolean zzav;
    public final Map zzaw;

    @Nullable
    public final com.google.android.gms.ads.internal.util.client.zzv zzax;

    @Nullable
    public final com.google.android.gms.ads.internal.util.client.zzw zzay;
    public final double zzaz;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final int zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final String zzj;
    public final String zzk;

    @Nullable
    public final zzcbp zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;

    @Nullable
    public final zzfjy zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Code duplicated, block: B:300:0x0904 A[PHI: r89 r91
      0x0904: PHI (r89v93 java.util.List) = 
      (r89v4 java.util.List)
      (r89v5 java.util.List)
      (r89v6 java.util.List)
      (r89v7 java.util.List)
      (r89v8 java.util.List)
      (r89v9 java.util.List)
      (r89v10 java.util.List)
      (r89v11 java.util.List)
      (r89v12 java.util.List)
      (r89v13 java.util.List)
      (r89v14 java.util.List)
      (r89v15 java.util.List)
      (r89v16 java.util.List)
      (r89v17 java.util.List)
      (r89v18 java.util.List)
      (r89v19 java.util.List)
      (r89v20 java.util.List)
      (r89v21 java.util.List)
      (r89v22 java.util.List)
      (r89v23 java.util.List)
      (r89v24 java.util.List)
      (r89v25 java.util.List)
      (r89v26 java.util.List)
      (r89v27 java.util.List)
      (r89v28 java.util.List)
      (r89v29 java.util.List)
      (r89v30 java.util.List)
      (r89v31 java.util.List)
      (r89v32 java.util.List)
      (r89v33 java.util.List)
      (r89v34 java.util.List)
      (r89v35 java.util.List)
      (r89v36 java.util.List)
      (r89v37 java.util.List)
      (r89v38 java.util.List)
      (r89v39 java.util.List)
      (r89v40 java.util.List)
      (r89v41 java.util.List)
      (r89v42 java.util.List)
      (r89v43 java.util.List)
      (r89v44 java.util.List)
      (r89v45 java.util.List)
      (r89v46 java.util.List)
      (r89v47 java.util.List)
      (r89v48 java.util.List)
      (r89v49 java.util.List)
      (r89v50 java.util.List)
      (r89v51 java.util.List)
      (r89v52 java.util.List)
      (r89v53 java.util.List)
      (r89v54 java.util.List)
      (r89v55 java.util.List)
      (r89v56 java.util.List)
      (r89v57 java.util.List)
      (r89v58 java.util.List)
      (r89v59 java.util.List)
      (r89v60 java.util.List)
      (r89v61 java.util.List)
      (r89v62 java.util.List)
      (r89v63 java.util.List)
      (r89v64 java.util.List)
      (r89v65 java.util.List)
      (r89v66 java.util.List)
      (r89v67 java.util.List)
      (r89v68 java.util.List)
      (r89v69 java.util.List)
      (r89v70 java.util.List)
      (r89v71 java.util.List)
      (r89v72 java.util.List)
      (r89v73 java.util.List)
      (r89v74 java.util.List)
      (r89v75 java.util.List)
      (r89v76 java.util.List)
      (r89v77 java.util.List)
      (r89v78 java.util.List)
      (r89v79 java.util.List)
      (r89v80 java.util.List)
      (r89v81 java.util.List)
      (r89v82 java.util.List)
      (r89v83 java.util.List)
      (r89v84 java.util.List)
      (r89v85 java.util.List)
      (r89v86 java.util.List)
      (r89v87 java.util.List)
      (r89v88 java.util.List)
      (r89v89 java.util.List)
      (r89v90 java.util.List)
      (r89v91 java.util.List)
      (r89v94 java.util.List)
     binds: [B:298:0x08fc, B:295:0x08e6, B:292:0x08d0, B:286:0x08a3, B:283:0x088f, B:280:0x0879, B:277:0x0863, B:271:0x0836, B:268:0x081c, B:265:0x0808, B:262:0x07f4, B:259:0x07de, B:256:0x07c4, B:253:0x07b0, B:247:0x0784, B:244:0x076a, B:241:0x0754, B:238:0x073e, B:235:0x0728, B:232:0x0712, B:229:0x06fc, B:226:0x06e6, B:223:0x06d0, B:220:0x06ba, B:217:0x06a0, B:214:0x068a, B:211:0x0675, B:208:0x065c, B:205:0x0646, B:202:0x0632, B:199:0x061e, B:196:0x060a, B:193:0x05f2, B:190:0x05de, B:187:0x05ca, B:184:0x05b6, B:178:0x058d, B:175:0x0577, B:172:0x055d, B:169:0x0549, B:166:0x0533, B:163:0x051d, B:160:0x0507, B:157:0x04f1, B:154:0x04de, B:151:0x04c8, B:148:0x04b4, B:145:0x049e, B:142:0x0488, B:139:0x0472, B:137:0x0462, B:132:0x0441, B:129:0x042b, B:126:0x0417, B:123:0x0401, B:120:0x03ed, B:117:0x03d9, B:114:0x03c3, B:111:0x03ad, B:108:0x0397, B:105:0x0381, B:102:0x036d, B:93:0x0339, B:90:0x0323, B:87:0x030a, B:81:0x02e1, B:78:0x02cd, B:75:0x02b4, B:72:0x02a0, B:69:0x028d, B:66:0x0277, B:63:0x0261, B:60:0x024b, B:57:0x0237, B:51:0x020e, B:48:0x01f8, B:45:0x01e4, B:42:0x01d0, B:39:0x01bc, B:36:0x01a8, B:33:0x0193, B:30:0x0180, B:27:0x016b, B:24:0x0158, B:21:0x0143, B:18:0x012e, B:13:0x0115, B:11:0x0103, B:307:0x0904] A[DONT_GENERATE, DONT_INLINE]
      0x0904: PHI (r91v91 java.util.List) = 
      (r91v1 java.util.List)
      (r91v2 java.util.List)
      (r91v3 java.util.List)
      (r91v4 java.util.List)
      (r91v5 java.util.List)
      (r91v6 java.util.List)
      (r91v7 java.util.List)
      (r91v8 java.util.List)
      (r91v9 java.util.List)
      (r91v10 java.util.List)
      (r91v11 java.util.List)
      (r91v12 java.util.List)
      (r91v13 java.util.List)
      (r91v14 java.util.List)
      (r91v15 java.util.List)
      (r91v16 java.util.List)
      (r91v17 java.util.List)
      (r91v18 java.util.List)
      (r91v19 java.util.List)
      (r91v20 java.util.List)
      (r91v21 java.util.List)
      (r91v22 java.util.List)
      (r91v23 java.util.List)
      (r91v24 java.util.List)
      (r91v25 java.util.List)
      (r91v26 java.util.List)
      (r91v27 java.util.List)
      (r91v28 java.util.List)
      (r91v29 java.util.List)
      (r91v30 java.util.List)
      (r91v31 java.util.List)
      (r91v32 java.util.List)
      (r91v33 java.util.List)
      (r91v34 java.util.List)
      (r91v35 java.util.List)
      (r91v36 java.util.List)
      (r91v37 java.util.List)
      (r91v38 java.util.List)
      (r91v39 java.util.List)
      (r91v40 java.util.List)
      (r91v41 java.util.List)
      (r91v42 java.util.List)
      (r91v43 java.util.List)
      (r91v44 java.util.List)
      (r91v45 java.util.List)
      (r91v46 java.util.List)
      (r91v47 java.util.List)
      (r91v48 java.util.List)
      (r91v49 java.util.List)
      (r91v50 java.util.List)
      (r91v51 java.util.List)
      (r91v52 java.util.List)
      (r91v53 java.util.List)
      (r91v54 java.util.List)
      (r91v55 java.util.List)
      (r91v56 java.util.List)
      (r91v57 java.util.List)
      (r91v58 java.util.List)
      (r91v59 java.util.List)
      (r91v60 java.util.List)
      (r91v61 java.util.List)
      (r91v62 java.util.List)
      (r91v63 java.util.List)
      (r91v64 java.util.List)
      (r91v65 java.util.List)
      (r91v66 java.util.List)
      (r91v67 java.util.List)
      (r91v68 java.util.List)
      (r91v69 java.util.List)
      (r91v70 java.util.List)
      (r91v71 java.util.List)
      (r91v72 java.util.List)
      (r91v73 java.util.List)
      (r91v74 java.util.List)
      (r91v75 java.util.List)
      (r91v76 java.util.List)
      (r91v77 java.util.List)
      (r91v78 java.util.List)
      (r91v79 java.util.List)
      (r91v80 java.util.List)
      (r91v81 java.util.List)
      (r91v82 java.util.List)
      (r91v83 java.util.List)
      (r91v84 java.util.List)
      (r91v85 java.util.List)
      (r91v86 java.util.List)
      (r91v87 java.util.List)
      (r91v88 java.util.List)
      (r91v92 java.util.List)
     binds: [B:298:0x08fc, B:295:0x08e6, B:292:0x08d0, B:286:0x08a3, B:283:0x088f, B:280:0x0879, B:277:0x0863, B:271:0x0836, B:268:0x081c, B:265:0x0808, B:262:0x07f4, B:259:0x07de, B:256:0x07c4, B:253:0x07b0, B:247:0x0784, B:244:0x076a, B:241:0x0754, B:238:0x073e, B:235:0x0728, B:232:0x0712, B:229:0x06fc, B:226:0x06e6, B:223:0x06d0, B:220:0x06ba, B:217:0x06a0, B:214:0x068a, B:211:0x0675, B:208:0x065c, B:205:0x0646, B:202:0x0632, B:199:0x061e, B:196:0x060a, B:193:0x05f2, B:190:0x05de, B:187:0x05ca, B:184:0x05b6, B:178:0x058d, B:175:0x0577, B:172:0x055d, B:169:0x0549, B:166:0x0533, B:163:0x051d, B:160:0x0507, B:157:0x04f1, B:154:0x04de, B:151:0x04c8, B:148:0x04b4, B:145:0x049e, B:142:0x0488, B:139:0x0472, B:137:0x0462, B:132:0x0441, B:129:0x042b, B:126:0x0417, B:123:0x0401, B:120:0x03ed, B:117:0x03d9, B:114:0x03c3, B:111:0x03ad, B:108:0x0397, B:105:0x0381, B:102:0x036d, B:93:0x0339, B:90:0x0323, B:87:0x030a, B:81:0x02e1, B:78:0x02cd, B:75:0x02b4, B:72:0x02a0, B:69:0x028d, B:66:0x0277, B:63:0x0261, B:60:0x024b, B:57:0x0237, B:51:0x020e, B:48:0x01f8, B:45:0x01e4, B:42:0x01d0, B:39:0x01bc, B:36:0x01a8, B:33:0x0193, B:30:0x0180, B:27:0x016b, B:24:0x0158, B:21:0x0143, B:18:0x012e, B:13:0x0115, B:11:0x0103, B:307:0x0904] A[DONT_GENERATE, DONT_INLINE]] */
    public zzfjt(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List list;
        List list2;
        List listZzb = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzgvz.zzi();
        zzgvz zzgvzVarZzi = zzgvz.zzi();
        HashMap map = new HashMap();
        zzgvz zzgvzVarZzi2 = zzgvz.zzi();
        zzgvz zzgvzVarZzi3 = zzgvz.zzi();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        int iZzc = 0;
        List listZzb2 = listZzb;
        JSONObject jSONObjectZzd = jSONObject2;
        JSONObject jSONObjectZzd2 = jSONObject3;
        JSONObject jSONObjectZzd3 = jSONObject4;
        JSONObject jSONObjectZzd4 = jSONObject5;
        JSONObject jSONObjectZzd5 = jSONObject6;
        List listZzb3 = zzgvzVarZzi;
        Map mapZzc = map;
        List listZzb4 = zzgvzVarZzi2;
        zzgvz zzgvzVarZza = zzgvzVarZzi3;
        Bundle bundle2 = bundle;
        boolean zNextBoolean = true;
        int iZze = -1;
        int iNextInt = -1;
        int iNextInt2 = -1;
        int iZzd = 0;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        boolean zNextBoolean8 = false;
        int iNextInt3 = 0;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        boolean zNextBoolean11 = false;
        int iNextInt4 = 0;
        boolean zNextBoolean12 = false;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        boolean zNextBoolean18 = false;
        boolean zNextBoolean19 = false;
        int iNextInt5 = 0;
        boolean zNextBoolean20 = false;
        boolean zNextBoolean21 = false;
        boolean zNextBoolean22 = false;
        int iNextInt6 = 0;
        int iZza = 2;
        double dNextDouble = 0.0d;
        zzcbp zzcbpVarZza = null;
        zzfjy zzfjyVar = null;
        zzccy zzccyVarZza = null;
        zzbyv zzbyvVarZza = null;
        com.google.android.gms.ads.internal.client.zzt zztVarZza = null;
        String strNextString = null;
        com.google.android.gms.ads.internal.util.client.zzv zzvVarZzb = null;
        com.google.android.gms.ads.internal.util.client.zzw zzwVarZzd = null;
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        String string = strNextString6;
        String strNextString7 = string;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        String strNextString17 = strNextString16;
        String strNextString18 = strNextString17;
        String strNextString19 = strNextString18;
        String strNextString20 = strNextString19;
        List listZzb5 = listZzb2;
        List listZzb6 = listZzb5;
        List listZzb7 = listZzb6;
        List listZzb8 = listZzb7;
        List listZzb9 = listZzb8;
        List listZzb10 = listZzb9;
        List listZzb11 = listZzb10;
        List listZzb12 = listZzb11;
        List listZza = listZzb12;
        List listZzb13 = listZza;
        List listZza2 = listZzb13;
        JSONObject jSONObjectZzd6 = jSONObject;
        List listZzb14 = listZza2;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? "" : strNextName;
            switch (str.hashCode()) {
                case -2138196627:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("ad_source_instance_name")) {
                        strNextString15 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1980587809:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("debug_signals")) {
                        jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1965512151:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("omid_settings")) {
                        jSONObjectZzd3 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1964744830:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("offline_ad_config") && ((Boolean) zzbie.zzjP.zzg()).booleanValue()) {
                        zzwVarZzd = com.google.android.gms.ads.internal.util.client.zzw.zzd(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1871425831:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("recursive_server_response_data")) {
                        strNextString18 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1843156475:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("is_consent")) {
                        zNextBoolean19 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1840512279:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("presentation_urls")) {
                        listZzb4 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1828733410:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("network_ping_config") && ((Boolean) zzbie.zzjN.zzg()).booleanValue()) {
                        zzvVarZzb = com.google.android.gms.ads.internal.util.client.zzv.zzb(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1812055556:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("play_prewarm_options")) {
                        zzbyvVarZza = zzbyv.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1785028569:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("parallel_key")) {
                        strNextString20 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1776946669:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("ad_source_name")) {
                        strNextString13 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1662989631:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("is_interscroller")) {
                        zNextBoolean13 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1620552059:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("preload_sort_type")) {
                        iZza = zzfsx.zza(jsonReader.nextInt());
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1620470467:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("backend_query_id")) {
                        strNextString10 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1550155393:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (!str.equals("nofill_urls")) {
                        listZzb12 = list2;
                        listZzb11 = list;
                    } else {
                        listZzb11 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        listZzb12 = list2;
                    }
                    break;
                case -1440104884:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("is_custom_close_blocked")) {
                        zNextBoolean7 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1439500848:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("orientation")) {
                        iZze = zze(jsonReader.nextString());
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1428969291:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("enable_omid")) {
                        zNextBoolean9 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1406227629:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("buffer_click_url_as_ready_to_ping")) {
                        zNextBoolean17 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1403779768:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("showable_impression_type")) {
                        iNextInt4 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1375413093:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("ad_cover")) {
                        jSONObjectZzd4 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1360811658:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("ad_sizes")) {
                        listZza = zzfju.zza(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1306015996:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("adapters")) {
                        listZzb13 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1303332046:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("test_mode_enabled")) {
                        zNextBoolean6 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1289032093:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("extras")) {
                        jSONObjectZzd2 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1240082064:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("ad_event_value")) {
                        zztVarZza = com.google.android.gms.ads.internal.client.zzt.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1234181075:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("allow_pub_rendered_attribution")) {
                        zNextBoolean2 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1168140544:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("presentation_error_urls")) {
                        listZzb12 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                        listZzb12 = list2;
                    }
                    listZzb11 = list;
                    break;
                case -1152230954:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("ad_type")) {
                        iZzc = zzc(jsonReader.nextString());
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1146534047:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("is_scroll_aware")) {
                        zNextBoolean11 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1115838944:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("fill_urls")) {
                        listZzb10 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1081936678:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("allocation_id")) {
                        strNextString4 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1078050970:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("video_complete_urls")) {
                        listZzb9 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -1051269058:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("active_view")) {
                        string = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader).toString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -982608540:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("valid_from_timestamp")) {
                        strNextString2 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -972056451:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("ad_source_instance_id")) {
                        strNextString16 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -776859333:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("click_urls")) {
                        listZzb14 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -652881372:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("on_device_storage_configs") && ((Boolean) zzbie.zziK.zzg()).booleanValue()) {
                        zzgvzVarZza = zzead.zza(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -570101180:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("late_load_urls")) {
                        listZzb3 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -544216775:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("safe_browsing")) {
                        zzccyVarZza = zzccy.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -437057161:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("imp_urls")) {
                        listZzb5 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -404433734:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("rtb_native_required_assets")) {
                        jSONObjectZzd5 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -404326515:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("render_timeout_ms")) {
                        iNextInt3 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -397704715:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("ad_close_time_ms")) {
                        iNextInt = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -388807511:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("content_url")) {
                        strNextString = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -369773488:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("is_close_button_enabled")) {
                        jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -213449460:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("force_disable_hardware_acceleration")) {
                        zNextBoolean16 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -213424028:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals(MBridgeConstans.EXTRA_KEY_WM)) {
                        strNextString9 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -180214626:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("native_required_asset_viewability")) {
                        zNextBoolean15 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -154616268:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("is_offline_ad")) {
                        zNextBoolean14 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case -29338502:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("allow_custom_click_gesture")) {
                        zNextBoolean4 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 3107:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("ad")) {
                        zzfjyVar = new zzfjy(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 3355:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("id")) {
                        strNextString5 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 3076010:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("data")) {
                        jSONObjectZzd6 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 37109963:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals(CommonUrlParts.REQUEST_ID)) {
                        strNextString17 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 63195984:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("render_test_label")) {
                        zNextBoolean5 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 107433883:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("qdata")) {
                        strNextString6 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 230323073:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("ad_load_urls")) {
                        listZzb6 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 281223176:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("is_secondary_analytics_logging_enabled")) {
                        zNextBoolean = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 418392395:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("is_closable_area_disabled")) {
                        zNextBoolean8 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 542250332:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("consent_form_action_identifier")) {
                        iNextInt5 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 549176928:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("presentation_error_timeout_ms")) {
                        iNextInt6 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 597473788:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("debug_dialog_string")) {
                        strNextString7 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 639133141:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("response_info_extras_override") && ((Boolean) zzbie.zzhL.zzg()).booleanValue()) {
                        try {
                            Bundle bundleZzl = com.google.android.gms.ads.internal.util.zzbp.zzl(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                            if (bundleZzl != null) {
                                bundle2 = bundleZzl;
                            }
                        } catch (IllegalStateException unused) {
                            jsonReader.skipValue();
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 754887508:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("container_sizes")) {
                        listZza2 = zzfju.zza(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 791122864:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("impression_type")) {
                        iZzd = zzd(jsonReader.nextInt());
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 805095541:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("analytics_event_name_to_parameters_map") && ((Boolean) zzbie.zzaP.zzg()).booleanValue()) {
                        mapZzc = com.google.android.gms.ads.internal.util.zzbp.zzc(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1010584092:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("transaction_id")) {
                        strNextString3 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1100650276:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("rewards")) {
                        zzcbpVarZza = zzcbp.zza(com.google.android.gms.ads.internal.util.zzbp.zze(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1141602460:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("adapter_response_info_key")) {
                        strNextString19 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1186014765:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("cache_hit_urls")) {
                        com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1303622534:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("preload_sort_value")) {
                        dNextDouble = jsonReader.nextDouble();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1321720943:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("allow_pub_owned_ad_view")) {
                        zNextBoolean3 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1422388341:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("is_collapsible")) {
                        zNextBoolean18 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1437255331:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals(CampaignEx.JSON_KEY_AD_SOURCE_ID)) {
                        strNextString14 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1556932485:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("post_click_lifecycle_monitoring_duration_ms") && ((Boolean) zzbie.zzon.zzg()).booleanValue()) {
                        iNextInt2 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1565514205:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("adapter_only_third_party_impression")) {
                        zNextBoolean22 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1637553475:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("bid_response")) {
                        strNextString8 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1638957285:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("video_start_urls")) {
                        listZzb7 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1686319423:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("ad_network_class_name")) {
                        strNextString12 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1688341040:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("video_reward_urls")) {
                        listZzb8 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1799285870:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("use_third_party_container_height")) {
                        zNextBoolean12 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1839650832:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("renderers")) {
                        listZzb = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 1875425491:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("is_analytics_logging_enabled")) {
                        zNextBoolean10 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 2068142375:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("rule_line_external_id")) {
                        strNextString11 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 2072888499:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("manual_tracking_urls")) {
                        listZzb2 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 2075506442:
                    list = listZzb11;
                    list2 = listZzb12;
                    if (str.equals("render_serially")) {
                        zNextBoolean20 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                case 2117205836:
                    list2 = listZzb12;
                    list = listZzb11;
                    if (str.equals("flow_control")) {
                        zNextBoolean21 = jsonReader.nextBoolean();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
                default:
                    list = listZzb11;
                    list2 = listZzb12;
                    jsonReader.skipValue();
                    listZzb12 = list2;
                    listZzb11 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.zza = listZzb;
        this.zzb = iZzc;
        this.zzc = listZzb14;
        this.zzd = listZzb5;
        this.zzf = listZzb6;
        this.zze = iZzd;
        this.zzg = listZzb7;
        this.zzh = listZzb8;
        this.zzi = listZzb9;
        this.zzj = strNextString3;
        this.zzk = strNextString2;
        this.zzl = zzcbpVarZza;
        this.zzm = listZzb10;
        this.zzn = listZzb11;
        this.zzo = listZzb12;
        this.zzp = listZzb2;
        this.zzq = iNextInt6;
        this.zzr = listZza2;
        this.zzs = zzfjyVar;
        this.zzt = listZzb13;
        this.zzu = listZza;
        this.zzw = strNextString4;
        this.zzv = jSONObjectZzd6;
        this.zzx = strNextString5;
        this.zzy = strNextString6;
        this.zzz = string;
        this.zzA = zzccyVarZza;
        this.zzB = strNextString7;
        this.zzC = jSONObjectZzd;
        this.zzD = jSONObjectZzd2;
        this.zzJ = zNextBoolean2;
        this.zzK = zNextBoolean3;
        this.zzL = zNextBoolean4;
        this.zzM = zNextBoolean5;
        this.zzN = zNextBoolean6;
        this.zzO = zNextBoolean7;
        this.zzP = zNextBoolean8;
        this.zzQ = iZze;
        this.zzR = iNextInt3;
        this.zzT = zNextBoolean9;
        this.zzU = strNextString8;
        this.zzV = new zzfkp(jSONObjectZzd3);
        this.zzW = zNextBoolean10;
        this.zzX = zNextBoolean11;
        this.zzY = iNextInt4;
        this.zzZ = strNextString9;
        this.zzaa = iNextInt;
        this.zzab = strNextString10;
        this.zzac = zNextBoolean12;
        this.zzad = zzbyvVarZza;
        this.zzae = zztVarZza;
        this.zzaf = strNextString11;
        this.zzag = zNextBoolean13;
        this.zzah = jSONObjectZzd4;
        this.zzE = strNextString12;
        this.zzF = strNextString13;
        this.zzG = strNextString14;
        this.zzH = strNextString15;
        this.zzI = strNextString16;
        this.zzai = zNextBoolean14;
        this.zzaj = jSONObjectZzd5;
        this.zzak = zNextBoolean15;
        this.zzal = strNextString;
        this.zzam = zNextBoolean16;
        this.zzS = zNextBoolean17;
        this.zzan = strNextString17;
        this.zzao = strNextString18;
        this.zzap = strNextString19;
        this.zzaq = zNextBoolean18;
        this.zzar = zNextBoolean19;
        this.zzas = iNextInt5;
        this.zzau = listZzb3;
        this.zzat = strNextString20;
        this.zzav = zNextBoolean20;
        this.zzaw = mapZzc;
        this.zzax = zzvVarZzb;
        this.zzay = zzwVarZzd;
        this.zzaz = dNextDouble;
        this.zzaH = iZza;
        this.zzaA = listZzb4;
        this.zzaB = zNextBoolean21;
        this.zzaC = zzgvzVarZza;
        this.zzaD = zNextBoolean22;
        this.zzaE = iNextInt2;
        this.zzaF = bundle2;
        this.zzaG = zNextBoolean;
    }

    public static String zza(int i10) {
        switch (i10) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzc(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzd(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 3 || i10 == 4) {
            return i10;
        }
        return 0;
    }

    private static int zze(String str) {
        if (C4235d4.i.C.equalsIgnoreCase(str)) {
            return 6;
        }
        return C4235d4.i.D.equalsIgnoreCase(str) ? 7 : -1;
    }

    public final boolean zzb() {
        return this.zzai || this.zzay != null;
    }
}
