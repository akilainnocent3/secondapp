package defpackage;

import com.sportybet.android.account.international.data.model.KycFieldRequest;
import com.sportybet.android.account.international.data.model.KycFieldRequestData;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class psp {
    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList a(Map map) {
        Object kycFieldRequest;
        map.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object kycFieldRequest2 = null;
            switch ((String) entry.getKey()) {
                case "R0001":
                    Object value = entry.getValue();
                    htp htpVar = value instanceof htp ? (htp) value : null;
                    if (htpVar != null) {
                        kycFieldRequest2 = new KycFieldRequest((String) entry.getKey(), new KycFieldRequestData.NameRequestData(htpVar.a, htpVar.b));
                        continue;
                    }
                case "R0002":
                    String str = (String) entry.getKey();
                    Object value2 = entry.getValue();
                    kycFieldRequest2 = value2 instanceof String ? (String) value2 : null;
                    kycFieldRequest = new KycFieldRequest(str, new KycFieldRequestData.DateOfBirthRequestData(kycFieldRequest2 != null ? kycFieldRequest2 : ""));
                    break;
                case "R0004":
                    Object value3 = entry.getValue();
                    KycFieldRequestData.AddressRequestData addressRequestData = value3 instanceof KycFieldRequestData.AddressRequestData ? (KycFieldRequestData.AddressRequestData) value3 : null;
                    if (addressRequestData != null) {
                        kycFieldRequest2 = new KycFieldRequest((String) entry.getKey(), addressRequestData);
                    } else {
                        continue;
                    }
                case "R0013":
                    String str2 = (String) entry.getKey();
                    Object value4 = entry.getValue();
                    kycFieldRequest2 = value4 instanceof String ? (String) value4 : null;
                    kycFieldRequest = new KycFieldRequest(str2, new KycFieldRequestData.CPFRequestData(kycFieldRequest2 != null ? kycFieldRequest2 : ""));
                    break;
                case "R0027":
                    Object value5 = entry.getValue();
                    KycFieldRequestData.CountryCodeRequestData countryCodeRequestData = value5 instanceof KycFieldRequestData.CountryCodeRequestData ? (KycFieldRequestData.CountryCodeRequestData) value5 : null;
                    if (countryCodeRequestData != null) {
                        kycFieldRequest2 = new KycFieldRequest((String) entry.getKey(), countryCodeRequestData);
                    } else {
                        continue;
                    }
                default:
                    continue;
                    arrayList.add(kycFieldRequest2);
                    break;
            }
            kycFieldRequest2 = kycFieldRequest;
            arrayList.add(kycFieldRequest2);
        }
        return CollectionsKt.R(arrayList);
    }
}
