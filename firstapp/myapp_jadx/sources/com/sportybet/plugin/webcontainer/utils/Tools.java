package com.sportybet.plugin.webcontainer.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.hp0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class Tools {
    public static Intent getBroadCast(String str) {
        Intent intent = new Intent(str);
        intent.setPackage(hp0.A.getPackageName());
        return intent;
    }

    public static int getPixelByDip(Context context, int i) {
        return (int) ((context.getResources().getDisplayMetrics().density * i) + 0.5f);
    }

    private static Set<String> getQueryParameterNames(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int iIndexOf = encodedQuery.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = encodedQuery.length();
            }
            int iIndexOf2 = encodedQuery.indexOf(61, i);
            if (iIndexOf2 > iIndexOf || iIndexOf2 == -1) {
                iIndexOf2 = iIndexOf;
            }
            linkedHashSet.add(URLDecoder.decode(encodedQuery.substring(i, iIndexOf2)));
            i = iIndexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static byte[] inputStreamToBytes(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[512];
        while (true) {
            try {
                int i = inputStream.read(bArr, 0, 512);
                if (i <= 0) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (IOException unused) {
                return null;
            }
        }
    }

    public static HashMap<String, String> parseParams(Uri uri) {
        if (uri == null) {
            return new HashMap<>();
        }
        HashMap<String, String> map = new HashMap<>();
        for (String str : getQueryParameterNames(uri)) {
            map.put(str, uri.getQueryParameter(str));
        }
        return map;
    }
}
