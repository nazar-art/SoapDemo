package org.lelyak.demo;

import org.apache.log4j.Logger;
import org.lelyak.webservices.GeoIP;
import org.lelyak.webservices.GeoIPService;
import org.lelyak.webservices.GeoIPServiceSoap;

public class IPLocationFinder {

    private static final Logger LOG = Logger.getLogger(IPLocationFinder.class);

    public static void main(String[] args) {
        if (args.length != 1) {
            LOG.error("You need to pass in one IP address");
        } else {
            String ipAddress = args[0];
            GeoIPService geoIPService = new GeoIPService();
            GeoIPServiceSoap serviceSoap = geoIPService.getGeoIPServiceSoap();
            GeoIP geoIP = serviceSoap.getGeoIP(ipAddress);
            LOG.info("Country code:" + geoIP.getCountryCode());
            LOG.info("Country name:" + geoIP.getCountryName());
            LOG.info("Country ip address:" + geoIP.getIP());
        }
    }
}
