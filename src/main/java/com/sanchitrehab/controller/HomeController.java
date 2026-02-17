package com.sanchitrehab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Added import for Model
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Home");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Us");
        return "about";
    }

    @GetMapping("/services")
    public String services(Model model) {
        model.addAttribute("title", "Our Programs");
        return "services";
    }

    @GetMapping("/gallery")
    public String gallery(Model model) {
        model.addAttribute("title", "Facility Gallery");
        return "gallery";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contact Us");
        return "contact";
    }

    @GetMapping("/services/{type}")
    public String serviceDetail(@org.springframework.web.bind.annotation.PathVariable String type, Model model) {
        String title = "Service";
        String content = "";
        String heroImage = "/assets/images/hero.jpg"; // Default background

        switch (type) {
            case "alcohol":
                title = "Alcohol Addiction Treatment";
                content = "<p><strong>Alcohol addiction</strong> is a chronic disease characterized by uncontrolled drinking and preoccupation with alcohol. At Sanchit Rehab, we offer a comprehensive detoxification and rehabilitation program tailored to help individuals regain control over their lives.</p>"
                        + "<h3>Our Approach</h3>"
                        + "<ul>"
                        + "<li>Medically supervised detoxification to manage withdrawal symptoms safely.</li>"
                        + "<li>Individual and group counseling to address underlying psychological triggers.</li>"
                        + "<li>Cognitive Behavioral Therapy (CBT) and family therapy sessions.</li>"
                        + "<li>Relapse prevention planning and long-term aftercare support.</li>"
                        + "</ul>";
                heroImage = "/assets/images/alcohol.jpg"; // specific image
                break;
            case "drug":
                title = "Drug Addiction Treatment";
                content = "<p>Our <strong>Drug Addiction Treatment</strong> program is designed to address addictions to illicit drugs and prescription medications. We focus on breaking the cycle of dependency through medical intervention and holistic therapy.</p>"
                         + "<h3>Treatment Highlights</h3>"
                         + "<ul>"
                         + "<li>24/7 medical monitoring during the critical detox phase.</li>"
                         + "<li>Psychiatric evaluation and dual-diagnosis support.</li>"
                         + "<li>Yoga, meditation, and recreational activities for holistic healing.</li>"
                         + "</ul>";
                heroImage = "/assets/images/drug.jpg"; 
                break;
            case "nicotine":
                title = "Nicotine Addiction Treatment";
                content = "<p>Quitting tobacco is one of the hardest but most rewarding changes you can make. Our <strong>Nicotine De-addiction</strong> program uses medical and psychological support to help you live a smoke-free life.</p>"
                        + "<p>We combine counseling with nicotine replacement therapies (if prescribed) to manage cravings and behavioral triggers effectively.</p>";
                heroImage = "/assets/images/nicotine.jpg";
                break;
            case "cannabis":
                title = "Cannabis Addiction Treatment";
                content = "<p>While often termed 'recreational', cannabis use can lead to significant dependency and cognitive impact. Our program helps individuals overcome <strong>Cannabis Use Disorder</strong> through behavioral therapies and lifestyle restructuring.</p>";
                heroImage = "/assets/images/cannabis.png";
                break;
            case "opioids":
                title = "Opioids Addiction Treatment";
                content = "<p><strong>Opioid addiction</strong> requires specialized medical care. Our facility provides a safe environment for MAT (Medication-Assisted Treatment) combined with intense psychosocial support to support long-term recovery.</p>";
                heroImage = "/assets/images/opioids.jpg";
                break;
            case "gambling":
                title = "Gambling Addiction Treatment";
                content = "<p>Gambling addiction (Ludomania) is a behavioral disorder that can destroy lives. We treat the psychological roots of the compulsion, helping patients rebuild their financial and personal integrity through intense therapy and support groups.</p>";
                heroImage = "/assets/images/gambling.jpg";
                break;
            default:
                title = "Our Services";
                content = "<p>Contact us to learn more about our specialized programs.</p>";
                break;
        }

        model.addAttribute("title", title);
        model.addAttribute("pageTitle", title);
        model.addAttribute("pageContent", content);
        model.addAttribute("heroImage", heroImage);
        return "service-detail";
    }
}
