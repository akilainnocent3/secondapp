package defpackage;

import com.sporty.android.core.model.pocket.globalpay.AvailableChannel;
import com.sporty.android.core.model.pocket.globalpay.ChannelData;
import com.sporty.android.core.model.pocket.globalpay.TypeData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fdv {
    public static final boolean a(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final AvailableChannel b(AvailableChannel availableChannel) {
        Object obj;
        availableChannel.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = availableChannel.getTypes().iterator();
        while (true) {
            obj = null;
            ArrayList arrayList2 = null;
            if (!it.hasNext()) {
                break;
            }
            TypeData typeData = (TypeData) it.next();
            String type = typeData.getType();
            List<ChannelData> channels = typeData.getChannels();
            if (channels != null) {
                arrayList2 = new ArrayList();
                for (Object obj2 : channels) {
                    int id = ((ChannelData) obj2).getId();
                    c100 c100Var = c100.e;
                    if (id == 30001 || id == 26001 || id == 26002 || id == 26003 || id == 27003 || id == 27002 || id == 28002 || id == 28001 || id == 28001 || id == 28001 || id == 28001 || id == 27001 || id == 29001 || id == 29004 || id == 29002 || id == 29003 || id == 29005 || id == 29006 || id == 31001 || id == 31004 || id == 31006 || id == 31008 || id == 34001 || id == 34002 || id == 29007 || id == 33001 || id == 33003 || id == 32001 || id == 37001 || id == 32002 || id == 37002 || id == 35001 || id == 35002 || id == 36001 || id == 36002 || id == 202 || id == 26004) {
                        arrayList2.add(obj2);
                    }
                }
            }
            TypeData typeDataCopy$default = TypeData.copy$default(typeData, type, null, arrayList2, false, 10, null);
            List<ChannelData> channels2 = typeDataCopy$default.getChannels();
            if (channels2 != null && !channels2.isEmpty()) {
                arrayList.add(typeDataCopy$default);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            if (Intrinsics.g(((TypeData) obj3).getType(), "Pix")) {
                obj = obj3;
                break;
            }
        }
        TypeData typeData2 = (TypeData) obj;
        if (typeData2 != null) {
            arrayList.remove(typeData2);
            arrayList.add(0, typeData2);
        }
        return availableChannel.copy(arrayList);
    }

    public static void c(int i) {
        boolean z = true;
        if (i != 100 && i != 102 && i != 104) {
            if (i == 105) {
                i = 105;
            } else {
                z = false;
            }
        }
        hm20.c(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
    }

    public static String d(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        d580.a();
        return null;
    }
}
