package digital.meinegemeinde.plugins.calendar;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "Calendar")
public class CalendarPlugin extends Plugin {

    private Calendar implementation = new Calendar();

    // @PluginMethod
    // public void echo(PluginCall call) {
    //     String value = call.getString("value");

    //     JSObject ret = new JSObject();
    //     ret.put("value", implementation.echo(value));
    //     call.resolve(ret);
    // }

    @PluginMethod
    public void hasPermission(PluginCall call) {
        call.resolve();
    }

    @PluginMethod
    public void requestPermission(PluginCall call) {
        call.resolve();
    }

    @PluginMethod
    public void createEvent(PluginCall call) {
        String title = call.getString("title");
        String description = call.getString("description");
        String start = call.getString("start");
        String end = call.getString("end");

        call.resolve();
    }
}
