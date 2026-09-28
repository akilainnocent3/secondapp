package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class gmp {
    public static final HashMap<String, Constructor<? extends mlp>> b;
    public final HashMap<Integer, ArrayList<mlp>> a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends mlp>> map = new HashMap<>();
        b = map;
        try {
            map.put("KeyAttribute", plp.class.getConstructor(null));
            map.put("KeyPosition", ump.class.getConstructor(null));
            map.put("KeyCycle", ylp.class.getConstructor(null));
            map.put("KeyTimeCycle", dnp.class.getConstructor(null));
            map.put("KeyTrigger", enp.class.getConstructor(null));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public gmp(Context context, XmlResourceParser xmlResourceParser) {
        HashMap<String, a> map;
        HashMap<String, a> map2;
        mlp dnpVar;
        try {
            int eventType = xmlResourceParser.getEventType();
            mlp mlpVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    if (b.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (!name.equals("KeyTimeCycle")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                dnpVar = new dnp();
                                dnpVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                b(dnpVar);
                                mlpVar = dnpVar;
                                break;
                                break;
                            case -298435811:
                                if (!name.equals("KeyAttribute")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                dnpVar = new plp();
                                dnpVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                b(dnpVar);
                                mlpVar = dnpVar;
                                break;
                                break;
                            case 540053991:
                                if (!name.equals("KeyCycle")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                dnpVar = new ylp();
                                dnpVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                b(dnpVar);
                                mlpVar = dnpVar;
                                break;
                                break;
                            case 1153397896:
                                if (!name.equals("KeyPosition")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                dnpVar = new ump();
                                dnpVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                b(dnpVar);
                                mlpVar = dnpVar;
                                break;
                                break;
                            case 1308496505:
                                if (!name.equals("KeyTrigger")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                dnpVar = new enp();
                                dnpVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                b(dnpVar);
                                mlpVar = dnpVar;
                                break;
                                break;
                            default:
                                throw new NullPointerException("Key " + name + " not found");
                        }
                    }
                    if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (mlpVar != null && (map2 = mlpVar.d) != null) {
                            a.d(context, xmlResourceParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && mlpVar != null && (map = mlpVar.d) != null) {
                        a.d(context, xmlResourceParser, map);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("KeyFrames", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("KeyFrames", "Error parsing XML resource", e2);
        }
    }

    public final void a(n5w n5wVar) {
        Integer numValueOf = Integer.valueOf(n5wVar.c);
        HashMap<Integer, ArrayList<mlp>> map = this.a;
        ArrayList<mlp> arrayList = map.get(numValueOf);
        if (arrayList != null) {
            n5wVar.w.addAll(arrayList);
        }
        ArrayList<mlp> arrayList2 = map.get(-1);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                mlp mlpVar = arrayList2.get(i);
                i++;
                mlp mlpVar2 = mlpVar;
                String str = ((ConstraintLayout.LayoutParams) n5wVar.b.getLayoutParams()).Y;
                String str2 = mlpVar2.c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    n5wVar.a(mlpVar2);
                }
            }
        }
    }

    public final void b(mlp mlpVar) {
        Integer numValueOf = Integer.valueOf(mlpVar.b);
        HashMap<Integer, ArrayList<mlp>> map = this.a;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(mlpVar.b), new ArrayList<>());
        }
        ArrayList<mlp> arrayList = map.get(Integer.valueOf(mlpVar.b));
        if (arrayList != null) {
            arrayList.add(mlpVar);
        }
    }

    public gmp() {
    }
}
