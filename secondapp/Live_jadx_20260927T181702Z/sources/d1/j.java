package d1;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.NonNull;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import k.y0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f77504a = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f77505b = "application_locales";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f77506c = "locales";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f77507d = "AppLocalesStorageHelper";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f77508e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f77509f = new Object();

    /* JADX WARN: Code duplicated, block: B:43:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void a(@NonNull Context context, @NonNull String str) {
        synchronized (f77509f) {
            if (str.equals("")) {
                context.deleteFile(f77504a);
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(f77504a, 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, f77506c);
                        xmlSerializerNewSerializer.attribute(null, f77505b, str);
                        xmlSerializerNewSerializer.endTag(null, f77506c);
                        xmlSerializerNewSerializer.endDocument();
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th2) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th2;
                    }
                } catch (Exception e10) {
                    Log.w(f77507d, "Storing App Locales : Failed to persist app-locales in storage ", e10);
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
            } catch (FileNotFoundException unused3) {
                Log.w(f77507d, String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", f77504a));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
      0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @NonNull
    public static String b(@NonNull Context context) {
        String attributeValue;
        synchronized (f77509f) {
            attributeValue = "";
            try {
                FileInputStream fileInputStreamOpenFileInput = context.openFileInput(f77504a);
                try {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                        int depth = xmlPullParserNewPullParser.getDepth();
                        while (true) {
                            int next = xmlPullParserNewPullParser.next();
                            if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals(f77506c)) {
                                    attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, f77505b);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException | XmlPullParserException unused2) {
                        Log.w(f77507d, "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile(f77504a);
                    }
                } catch (Throwable th2) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th2;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }
}
